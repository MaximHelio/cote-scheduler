package boj.cotescheduler;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableBatchProcessing
@EnableScheduling
@SpringBootApplication
public class BojCoteSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BojCoteSchedulerApplication.class, args);
    }

}
