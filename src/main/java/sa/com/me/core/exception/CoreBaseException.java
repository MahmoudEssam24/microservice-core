package sa.com.me.core.exception;

import org.springframework.http.HttpStatus;
import lombok.Data;

@Data
public abstract class CoreBaseException extends RuntimeException {

	private static final long serialVersionUID = -3005464418522380957L;
	private String errorCode;
	private String field;
	private String message;

	public CoreBaseException(String message) {
		super(message);
	}

	public CoreBaseException() {
		super();
	}

	public CoreBaseException(String message, String erorCode, String field) {
		super(message);
		this.errorCode = erorCode;
		this.message = message;
		this.field = field;
	}

	public abstract HttpStatus getStatusCode();
}