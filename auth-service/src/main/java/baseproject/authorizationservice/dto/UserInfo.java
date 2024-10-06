package baseproject.authorizationservice.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;

@Data
@Builder
public class UserInfo {
    private Long id;
    private String username;
    private String password;
    private String token;
    private Long expires;
    private Boolean isActive;
    private List<SimpleGrantedAuthority> roles;
}
