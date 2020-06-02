package sa.com.me.core.exception;


import lombok.Data;

@Data
public class ErrorMessage {

	private ErrorSource error;

	public ErrorMessage() {
		super();
	}
}
