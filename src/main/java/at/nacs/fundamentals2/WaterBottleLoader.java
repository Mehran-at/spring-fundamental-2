package at.nacs.fundamentals2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@ConfigurationProperties("things")
public class WaterBottleLoader {
    @Setter
    @Getter
    private List<WaterBottle> bottles;
}
