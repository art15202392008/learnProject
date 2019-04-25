package study.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/3/12 15:17
 * @Description
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule(){
        //负载均衡改为随机
        return new RandomRule();
    }
}
