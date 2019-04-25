package study.config;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/3/12 15:14
 * @Description
 */
@Configuration
@RibbonClient(name = "study-provider-user",configuration = RibbonConfiguration.class )
public class TestConfiguration {
}
