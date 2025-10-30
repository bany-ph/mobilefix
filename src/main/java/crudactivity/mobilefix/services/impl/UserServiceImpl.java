package crudactivity.mobilefix.services.impl;

import crudactivity.mobilefix.dtos.request.UserRequestDTO;
import crudactivity.mobilefix.dtos.response.UserResponseDTO;
import crudactivity.mobilefix.dtos.response.UserSummaryDTO;
import crudactivity.mobilefix.mappers.UserMapper;
import crudactivity.mobilefix.repositories.UserRepository;
import crudactivity.mobilefix.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponseDTO saveUser(UserRequestDTO user) {
        return userMapper.toDTO(userRepository.save(userMapper.toEntity(user)));
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        return userRepository.findAll().stream().map(userMapper::toDTO).toList();
    }

    @Override
    public List<UserSummaryDTO> getAllUsersSummary() {
        return userRepository.findAll().stream().map(userMapper::toSummaryDTO).toList();
    }

    @Override
    public UserResponseDTO updateUser(UserRequestDTO user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
