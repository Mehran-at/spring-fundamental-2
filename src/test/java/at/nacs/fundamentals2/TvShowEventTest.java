package at.nacs.fundamentals2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TvShowEventTest {
    @Autowired
    TvShowEvent event;
    @Test
    void getTvShows() {
        List<String> expected = event.getTvShows();
        Assertions.assertEquals(2, expected.size());
    }
    @ParameterizedTest
    @ValueSource(strings = {"tv1", "tv2"})
    void testIndividualTvShows(String title) {
        List<String> actual = event.getTvShows();
        assertTrue(actual.contains(title));
    }
}