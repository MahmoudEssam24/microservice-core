package sa.com.me.core.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import sa.com.me.core.exception.CoreBaseException;
import sa.com.me.core.exception.ErrorSource;

@Component
public class CoreUtils {

    public ErrorSource getErrorResponse(CoreBaseException baseException) {

        ErrorSource errorSource = new ErrorSource();
        errorSource.setCode(baseException.getErrorCode());
        errorSource.setMessage(baseException.getMessage());
        errorSource.setField(baseException.getField());

        return errorSource;
    }

    public static String convertObjectToJson(Object value) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(value);
    }

}