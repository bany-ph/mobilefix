package crudactivity.mobilefix.dtos.response;



    public class RepairOrderResponseDTO {
        private Long id;
        private String issueDescription;
        private String techNotes;
        //device
        private String deviceBrand;
        private String deviceModel;
        private String deviceSerialNumber;

        //status
        private String statusName;

        //user
        private UserSummaryDTO customerUser;
        private UserSummaryDTO assigneeTechUser;
    }
