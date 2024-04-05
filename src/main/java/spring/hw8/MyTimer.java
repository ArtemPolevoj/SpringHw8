package spring.hw8;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Timer(level = Level.INFO)
public class MyTimer {
    public void start(int maxTime){
        System.out.println("Timer starter");
        for (int i = 1; i <= maxTime ; i++) {
            System.out.println(i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Timer stopped");
    }
}
