package at.nacs.fundamentals2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties("tvshow")
public class DexterExpert {
    private String name;
    private int seasons;
    private double rating;
}
