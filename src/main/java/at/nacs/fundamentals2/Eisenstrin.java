package at.nacs.fundamentals2;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Eisenstrin {
    @Getter
    @Value("${formula.energy}")
    private String formula;
}
