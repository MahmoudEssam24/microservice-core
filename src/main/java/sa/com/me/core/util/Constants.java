package sa.com.me.core.util;

public interface Constants {

    public String ERROR_VALIDATION_PAGE_NO_LESS_THAN_ZERO = "Page number can't be less than zero";
    public String ERROR_VALIDATION_PAGE_SIZE_GREATER_THAN_MAX = "Page size can't be greater than " + Constants.MAX_PAGE_SIZE;
    public int MAX_PAGE_SIZE = 100;
    public String TOKEN_TYPE = "Bearer";

}