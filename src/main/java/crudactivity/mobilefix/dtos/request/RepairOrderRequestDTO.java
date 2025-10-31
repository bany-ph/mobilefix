package crudactivity.mobilefix.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class RepairOrderRequestDTO {

    @NotNull(message = "id Device is mandatory")
    private Long idDevice;

    @NotNull(message = "id costumer is mandatory")
    private Long idCostumer;

    @NotBlank
    private String issueDescription;

    //can be null or empty
/*    private Long idAssignedTech;

    private String techNotes;*/
}
