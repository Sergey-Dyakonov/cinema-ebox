package edu.karazin.util;

import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.time.LocalDateTime;
import java.util.Random;

@Component
public class DataGenerator {
    private static final int AMOUNT_OF_RECORDS = 300;

    private final Random rand = new Random();

    @SneakyThrows
    @PostConstruct
    private void generateData() {
        File file = new File("generated.txt");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < AMOUNT_OF_RECORDS; i++) {
            int movieId = rand.nextInt(7) + 1;
            int cinemaId = rand.nextInt(3) + 1;
            int hallId;
            if (cinemaId == 1) {
                hallId = rand.nextInt(3) + 1;
            } else if (cinemaId == 2) {
                hallId = rand.nextInt(3) + 4;
            } else {
                hallId = rand.nextInt(3) + 7;
            }
            LocalDateTime startsAt = LocalDateTime.of(2024, 4, rand.nextInt(30) + 1, rand.nextInt(12) + 10, rand.nextInt(60));
            sb.append(String.format("(%d, %d, %d, '%s'),\n", movieId, cinemaId, hallId, startsAt));
        }
        FileUtils.writeStringToFile(file, sb.toString());
    }
}
