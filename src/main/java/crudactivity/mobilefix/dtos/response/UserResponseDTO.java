package crudactivity.mobilefix.dtos.response;

import lombok.Data;

@Data
public class UserResponseDTO {
    private Long id;
    private String username;
    private String roleName;
    private String email;
    private boolean enabled;
}
