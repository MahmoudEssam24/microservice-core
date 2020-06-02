package sa.com.me.core.exception;

import lombok.Data;

@Data
public class ErrorSource {

	private String field;
	private String code;
	private String message;

	public ErrorSource() {}

	public ErrorSource(String field, String code, String message) {
		this.field = field;
		this.code = code;
		this.message = message;
	}

}
