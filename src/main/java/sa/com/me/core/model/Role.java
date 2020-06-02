package sa.com.me.core.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class Role implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5842339818200688417L;

    private Long id;
    private RoleName name;

}
