package sa.com.me.core.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class ArticleDto {

    private Long id;
    @NotBlank(message = "Title field can't be empty")
    private String title;
    private String content;
    private Date date;
    private String imageUrl;
    private String sourceUrl;
    private String summary;
    private String thumbnailTemplateUrl;
    private String thumbnailUrl;

}