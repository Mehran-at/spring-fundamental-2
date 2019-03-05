package at.nacs.fundamentals2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cashier {
    @Getter
    @Value("${cashier.change}")
    private double change;
}
