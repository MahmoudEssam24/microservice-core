package sa.com.me.core.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class SinglePageResponse<T> {

    private T data;

    public SinglePageResponse() {

    }

    public SinglePageResponse(T data) {
        this.data = data;
    }
}