package spring.hw8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Hw8Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Hw8Application.class);
		MyTimer timer = context.getBean(MyTimer.class);
		timer.start(5);
	}

}
