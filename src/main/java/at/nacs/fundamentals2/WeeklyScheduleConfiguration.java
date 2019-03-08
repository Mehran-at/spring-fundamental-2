package at.nacs.fundamentals2;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

@Configuration
public class WeeklyScheduleConfiguration {
    @Bean
    ApplicationRunner weekly(Schedule schedule){
       return args -> {
           Map<DayOfWeek, String> weeklySchedule = schedule.getWeekly();
           System.out.println(weeklySchedule);
           Map<Integer, List<String>> daily = schedule.getDaily();
           System.out.println(daily);
       };
    }
}
