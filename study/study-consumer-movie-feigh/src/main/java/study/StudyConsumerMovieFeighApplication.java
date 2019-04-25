package study;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class StudyConsumerMovieFeighApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyConsumerMovieFeighApplication.class, args);
	}

	@Configuration
	public class HystrixConfiguration {
		@Bean
		public ServletRegistrationBean<HystrixMetricsStreamServlet> getServlet(){
			HystrixMetricsStreamServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();
			ServletRegistrationBean<HystrixMetricsStreamServlet> servletRegistrationBean = new ServletRegistrationBean();
			servletRegistrationBean.setServlet(hystrixMetricsStreamServlet);
			servletRegistrationBean.addUrlMappings("/hystrix.stream");
			servletRegistrationBean.setName("HystrixMetricsStreamServlet");
			return servletRegistrationBean;
		}
	}
}
