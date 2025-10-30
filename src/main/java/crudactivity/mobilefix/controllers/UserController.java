package crudactivity.mobilefix.controllers;

import crudactivity.mobilefix.dtos.request.UserRequestDTO;
import crudactivity.mobilefix.dtos.response.UserResponseDTO;
import crudactivity.mobilefix.dtos.response.UserSummaryDTO;
import crudactivity.mobilefix.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponseDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/summary")
    @ResponseStatus(HttpStatus.OK)
    public List<UserSummaryDTO> getAllUsersSummary(){
        return userService.getAllUsersSummary();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO saveUser(@Valid @RequestBody UserRequestDTO requestDTO){
        return userService.saveUser(requestDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
