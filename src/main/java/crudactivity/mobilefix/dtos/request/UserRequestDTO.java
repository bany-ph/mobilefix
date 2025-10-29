package crudactivity.mobilefix.dtos.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRequestDTO {
    @NotBlank(message = "Username is mandatory")
    private String username;

    @NotBlank(message = "Password is mandatory")
    @Size(min = 4, message = "Password must be greater than 4 characters")
    private String password;

    @Email(message = "Email format should be correct ")
    private String email;

    @NotBlank(message = "Role is mandatory")
    private Long idRole;

    @NotBlank(message = "Full name is mandatory")
    private String fullName;

}
