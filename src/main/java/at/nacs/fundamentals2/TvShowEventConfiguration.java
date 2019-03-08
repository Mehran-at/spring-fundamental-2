package at.nacs.fundamentals2;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class TvShowEventConfiguration {
    @Bean
    ApplicationRunner application(TvShowEvent event) {
        return args -> {
            List<String> tvshows = event.getTvshows();
            System.out.println(tvshows);
        };
    }

    @Bean
    ApplicationRunner application2(DexterExpert expert) {
        return args -> {
            System.out.println(expert.getName());
            System.out.println(expert.getRating());
            System.out.println(expert.getSeasons());
        };
    }
}
