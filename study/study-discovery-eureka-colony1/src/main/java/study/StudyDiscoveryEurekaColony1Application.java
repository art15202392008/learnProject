package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudyDiscoveryEurekaColony1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudyDiscoveryEurekaColony1Application.class, args);
	}

}
