package at.nacs.fundamentals2;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class WaterBottle {
    private String color;
    private int capacity;
}
