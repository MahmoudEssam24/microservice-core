package sa.com.me.core.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.extern.slf4j.Slf4j;
import sa.com.me.core.util.CoreUtils;

/*
 * this class is the base handler class to for any exception is thrown
 * */

@ControllerAdvice
@Slf4j
public class CoreBaseExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	private CoreUtils coreUtils;

	/*
	 * Handles the back end exceptions
	 */

	@ExceptionHandler(CoreBaseException.class)
	public ResponseEntity<ErrorMessage> handleApiExceptions(CoreBaseException baseException, WebRequest request) {

		log.info("handleApiExceptions Exception {} ", baseException);
		ErrorSource errorResponse = coreUtils.getErrorResponse(baseException);
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setError(errorResponse);
		return new ResponseEntity<ErrorMessage>(errorMessage, baseException.getStatusCode());
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		log.info("handleMethodArgumentNotValid Exception {} ", ex);

		ErrorSource errorResponse = new ErrorSource();
		errorResponse.setMessage(ex.getBindingResult().getFieldError().getDefaultMessage());
		errorResponse.setCode("400");
		errorResponse.setField(ex.getBindingResult().getFieldError().getField());
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setError(errorResponse);
		return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(NoContentException.class)
	public ResponseEntity<String> handleNoContentException() {
		log.info("handleNoContentException Exception {} ", ":O");
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}
