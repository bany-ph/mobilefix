package crudactivity.mobilefix.services;

import crudactivity.mobilefix.dtos.request.RepairOrderRequestDTO;
import crudactivity.mobilefix.dtos.response.RepairOrderResponseDTO;

import java.util.List;

public interface RepairOrderService {

    RepairOrderResponseDTO saveRepairOrder(RepairOrderRequestDTO requestDTO);
    List<RepairOrderResponseDTO> getAllRepairOrders();
    RepairOrderResponseDTO getRepairOrderById(Long id);

}
