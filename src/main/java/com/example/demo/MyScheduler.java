package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@Slf4j
public class MyScheduler {

    /**
     * This method is annotated with @Scheduled(fixedDelay = 4000),
     * which means that it is a task to be run at a fixed interval of 4000 milliseconds (or 4 seconds).
     * The task itself is simply printing "Fixed delay!" to the console.
     */
    @Scheduled(fixedDelay = 4000)
    public void sayingHelloToSchedulersUsingFixDelay() {
        System.out.println("Fixed delay!");
    }

    /**
     * The cron expression "0 20 15 * * ?" is a string that represents a schedule.
     * In this case, it's set to trigger the method every day at 15:20 (or 3:20 PM).
     * The structure of the cron expression is seconds minutes hours day-of-month month
     * day-of-week. Here, 0 20 15 means 0 seconds, 20 minutes, and 15 hours.
     * The * symbol in the day-of-month, month, and day-of-week fields means "every",
     * so the method will be executed every day.
     */
    @Scheduled(cron = "0 20 15 * * ?")
    public void sayingHelloToSchedulersUsingCron() {
        log.info("Cron is working!");
    }


//    @Bean


}
