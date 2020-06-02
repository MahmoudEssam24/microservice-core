package sa.com.me.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends CoreBaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3481919322800097027L;

	public NotFoundException(String message, String errorCode, String field) {
		super(message, errorCode, field);
	}

	@Override
	public HttpStatus getStatusCode() {
		return HttpStatus.NOT_FOUND;
	}

}