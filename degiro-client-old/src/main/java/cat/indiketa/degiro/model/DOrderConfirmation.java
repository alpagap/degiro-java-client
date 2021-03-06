package cat.indiketa.degiro.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class DOrderConfirmation {
    private String confirmationId;
    private double freeSpaceNew;
    private String message;
    private long status;
    private String statusText;
}
