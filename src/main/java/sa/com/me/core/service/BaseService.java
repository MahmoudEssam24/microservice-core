package sa.com.me.core.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import sa.com.me.core.exception.BadRequestException;
import sa.com.me.core.util.Constants;

public class BaseService {

    protected Pageable getPageable(int page, int size) {
        validatePageNumberAndSize(page, size);
        return PageRequest.of(page, size, Sort.Direction.DESC, "createdAt");
    }

    private void validatePageNumberAndSize(int page, int size) {
        if (page < 0) {
            throw new BadRequestException(Constants.ERROR_VALIDATION_PAGE_NO_LESS_THAN_ZERO, "400", "page");
        }
 
        if (size > Constants.MAX_PAGE_SIZE) {
            throw new BadRequestException(Constants.ERROR_VALIDATION_PAGE_SIZE_GREATER_THAN_MAX, "400", "size");
        }
    }


}
