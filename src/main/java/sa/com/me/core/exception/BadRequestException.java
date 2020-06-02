package sa.com.me.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends CoreBaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6407615622768274905L;

	public BadRequestException(String messageKey, String errorCode, String field) {
		super(messageKey, errorCode, field);
	}

	@Override
	public HttpStatus getStatusCode() {
		return HttpStatus.BAD_REQUEST;
	}

}