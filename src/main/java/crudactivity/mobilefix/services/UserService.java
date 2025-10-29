package crudactivity.mobilefix.services;

import crudactivity.mobilefix.dtos.request.UserRequestDTO;
import crudactivity.mobilefix.dtos.response.UserResponseDTO;
import crudactivity.mobilefix.dtos.response.UserSummaryDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO saveUser(UserRequestDTO user);
    List<UserResponseDTO> getAllUsers();
    List<UserSummaryDTO> getAllUsersSummary();
    UserResponseDTO updateUser( UserRequestDTO user);
    void deleteUser(Long id);
}
