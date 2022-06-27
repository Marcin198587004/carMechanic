import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
public class Repair {
    private String name;
    private double cost;
    private LocalDate repairdate;
}
