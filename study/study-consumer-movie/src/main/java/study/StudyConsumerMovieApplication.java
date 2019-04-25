package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudyConsumerMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyConsumerMovieApplication.class, args);
	}

	@Bean
	public RestTemplate restTempLate(){
		return new RestTemplate();
	}
}
