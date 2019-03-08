package at.nacs.fundamentals2;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Eisenstein {
    @Getter
    @Value("${formula.energy}")
    private String formula;
}
