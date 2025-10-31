package crudactivity.mobilefix.exceptions;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Builder
public class ErrorResponse {
    private int status;
    private String message;
    private String error;
    private LocalDateTime timestamp;

}
