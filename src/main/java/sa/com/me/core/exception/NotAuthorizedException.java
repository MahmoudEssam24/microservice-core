package sa.com.me.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class NotAuthorizedException extends CoreBaseException {

	private static final long serialVersionUID = 1L;

	public NotAuthorizedException(String message, String errorCode, String field) {
		super(message, errorCode, field);
	}

	@Override
	public HttpStatus getStatusCode() {
		return HttpStatus.UNAUTHORIZED;
	}

}