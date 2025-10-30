package crudactivity.mobilefix.mappers;

import crudactivity.mobilefix.dtos.request.UserRequestDTO;
import crudactivity.mobilefix.dtos.response.UserResponseDTO;
import crudactivity.mobilefix.dtos.response.UserSummaryDTO;
import crudactivity.mobilefix.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping( target = "roleName", source = "role.roleName")
    UserResponseDTO toDTO(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    @Mapping(target = "role.id", source = "idRole")
    User toEntity(UserRequestDTO user);


    UserSummaryDTO toSummaryDTO(User user);
}
