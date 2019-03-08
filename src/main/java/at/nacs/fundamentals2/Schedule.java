package at.nacs.fundamentals2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

@Component
@Setter
@Getter
@ConfigurationProperties("schedule")
public class Schedule {
    private Map<DayOfWeek, String> weekly;
    private Map<Integer, List<String>> daily;
}
