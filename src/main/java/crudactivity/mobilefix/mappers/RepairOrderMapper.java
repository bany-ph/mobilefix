package crudactivity.mobilefix.mappers;

import crudactivity.mobilefix.dtos.request.RepairOrderRequestDTO;
import crudactivity.mobilefix.dtos.response.RepairOrderResponseDTO;
import crudactivity.mobilefix.entities.RepairOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface RepairOrderMapper {
    @Mapping(source = "device.brand", target = "deviceBrand")
    @Mapping(source = "device.model", target = "deviceModel")
    @Mapping(source = "device.serialNumber", target = "deviceSerialNumber")
    @Mapping(source = "status.statusName", target = "statusName")
    @Mapping(source = "customerUser", target = "customerUser")
    @Mapping(source = "assigneeTechUser", target = "assigneeTechUser")
    RepairOrderResponseDTO toDTO(RepairOrder repairOrder);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    RepairOrder toEntity(RepairOrderRequestDTO repairOrder);
}
