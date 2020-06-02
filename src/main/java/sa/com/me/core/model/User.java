package sa.com.me.core.model;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;

    private Set<Role> roles = new HashSet<>();

}