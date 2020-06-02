package sa.com.me.core.util;

public enum Resource {

    
	ARTICLE("article"),
	USER("user");
	private String value;


	private Resource(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	void setValue(String value) {
		this.value = value;
	}

}
