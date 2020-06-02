package sa.com.me.core.dto;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
    
    private Long id;
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank (message = "Email is mandatory")
    private String email;

    @JsonProperty(access = Access.WRITE_ONLY)
    private String password;

    private Set<RoleDto> roles = new HashSet<RoleDto>();
}