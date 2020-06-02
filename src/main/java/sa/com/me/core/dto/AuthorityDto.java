package sa.com.me.core.dto;

import lombok.Data;

@Data
public class AuthorityDto {

    private Long id;
    private String roleName;
    private Long roleId;
    private String resource;
    private String action;

    public AuthorityDto() {
    }

    public AuthorityDto(String roleName, String resource, String action) {
        this.roleName = roleName;
        this.resource = resource;
        this.action = action;
    }
}