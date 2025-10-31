package crudactivity.mobilefix.services.impl;

import crudactivity.mobilefix.dtos.request.RepairOrderRequestDTO;
import crudactivity.mobilefix.dtos.response.RepairOrderResponseDTO;
import crudactivity.mobilefix.exceptions.custom.ResourceNotFoundException;
import crudactivity.mobilefix.mappers.RepairOrderMapper;
import crudactivity.mobilefix.repositories.RepairOrderRepository;
import crudactivity.mobilefix.repositories.StatusRepository;
import crudactivity.mobilefix.services.RepairOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairOrderServiceImpl implements RepairOrderService {

    private  final RepairOrderRepository repairOrderRepository;
    private final RepairOrderMapper mapper;

    public RepairOrderServiceImpl(RepairOrderRepository repairOrderRepository, RepairOrderMapper mapper) {
        this.repairOrderRepository = repairOrderRepository;

        this.mapper = mapper;
    }


    @Override
    public RepairOrderResponseDTO saveRepairOrder(RepairOrderRequestDTO requestDTO) {

        return mapper.toDTO( repairOrderRepository.save(mapper.toEntity(requestDTO)));
    }

    @Override
    public List<RepairOrderResponseDTO> getAllRepairOrders() {
        return  repairOrderRepository.findAll().stream().map(mapper::toDTO).toList();
    }

    @Override
    public RepairOrderResponseDTO getRepairOrderById(Long id) {
        return mapper.toDTO(repairOrderRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Repair Order", id)));
    }
}
