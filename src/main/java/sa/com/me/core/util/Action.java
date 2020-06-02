package sa.com.me.core.util;

public enum Action {

    GET("GET"), POST("POST"), PUT("PUT"), DELETE("DELETE");
    private String value;

    private Action(String value) {
        this.setValue(value);
    }

    public String getValue() {
        return value;
    }

    void setValue(String value) {
        this.value = value;
    }

}
