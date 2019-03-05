package at.nacs.fundamentals2;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.beans.BeanProperty;
import java.util.List;

@Component
public class TvShowEventConfiguration {
    @Bean
    ApplicationRunner application(TvShowEvent event) {
        return args -> {
            List<String> tvShows = event.getTvShows();
            System.out.println(tvShows);
        };
    }
//        new ApplicationRunner() {
//            @Override
//            public void run(ApplicationArguments args) throws Exception {
//            }
        @Bean
        ApplicationRunner application2(DexterExpert expert) {
            return args -> {
                System.out.println(expert.getName());
                System.out.println(expert.getSeasons());
                System.out.println(expert.getRating());
            };
    }

}
