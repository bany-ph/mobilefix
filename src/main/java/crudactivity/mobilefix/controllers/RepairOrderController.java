package crudactivity.mobilefix.controllers;

import crudactivity.mobilefix.dtos.request.RepairOrderRequestDTO;
import crudactivity.mobilefix.dtos.response.RepairOrderResponseDTO;
import crudactivity.mobilefix.services.RepairOrderService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class RepairOrderController {

    private final RepairOrderService repairOrderService;

    public RepairOrderController(RepairOrderService repairOrderService) {
        this.repairOrderService = repairOrderService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<RepairOrderResponseDTO> getAllRepairOrders(){
        return repairOrderService.getAllRepairOrders();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public RepairOrderResponseDTO getRepairOrderById(@PathVariable Long id){
      return repairOrderService.getRepairOrderById(id);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public RepairOrderResponseDTO saveRepairOrder(@Valid @RequestBody RepairOrderRequestDTO requestDTO){
        return repairOrderService.saveRepairOrder(requestDTO);
    }
}
