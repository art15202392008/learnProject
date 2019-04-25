package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudyDiscoveryEurekaColonyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyDiscoveryEurekaColonyApplication.class, args);
	}

}
