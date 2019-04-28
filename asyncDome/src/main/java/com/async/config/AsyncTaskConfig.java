package com.async.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;


/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/4/28 21:59
 * @Description
 */
@Configuration
public class AsyncTaskConfig {
    @Bean
    public AsyncTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setThreadNamePrefix("Async-Executor-Example");
        executor.setMaxPoolSize(10);
        executor.setCorePoolSize(3);
        // 使用预定义的异常处理类
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //...
        return executor;
    }

}
