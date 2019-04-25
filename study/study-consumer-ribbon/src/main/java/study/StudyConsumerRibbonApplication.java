package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudyConsumerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyConsumerRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTempLate(){
		return new RestTemplate();
	}

}
