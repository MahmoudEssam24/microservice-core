package sa.com.me.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class NoContentException extends CoreBaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3732444640534869201L;

	public NoContentException() {
		super();
	}

	public NoContentException(String message, String errorCode, String field) {
		super(message, errorCode, field);
	}

	@Override
	public HttpStatus getStatusCode() {
		return HttpStatus.NO_CONTENT;
	}

}