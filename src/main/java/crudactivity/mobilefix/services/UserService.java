package crudactivity.mobilefix.services;

import crudactivity.mobilefix.dtos.request.UserRequestDTO;
import crudactivity.mobilefix.dtos.response.UserResponseDTO;
import crudactivity.mobilefix.dtos.response.UserSummaryDTO;
import crudactivity.mobilefix.entities.User;

import java.util.List;

public interface UserService {
    UserResponseDTO saveUser(UserRequestDTO user);
    List<UserResponseDTO> getAllUsers();
    UserResponseDTO getUserById(Long id);
    List<UserSummaryDTO> getAllUsersSummary();
    UserResponseDTO updateUser( UserRequestDTO user);
    void deleteUser(Long id);
}
