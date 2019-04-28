package com.async.util;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/4/28 22:00
 * @Description
 */
@Component
public class AsyncTaskDemo {

    @Async
    public void test1() {
        try {
            System.out.println("开始执行异步调用 不含参数和返回值  ");
            Thread.sleep(5000);
            System.out.println("完成异步调用 不含参数和返回值 ");
        }catch (Exception e){
            System.out.println("不含参数和返回值 异步调用异常  "+e.getMessage());
        }
    }

    @Async
    public void test2(String name) {
        try{
            System.out.println("开始执行异步调用 包含参数==="+name);
            Thread.sleep(5000);
            System.out.println("完成异步调用 包含参数==="+name);
        }catch (Exception e){
            System.out.println("含参数 无返回值 异步调用  "+e.getMessage());

        }
    }

    @Async
    public Future<String> test3(String name) {
        try{
            System.out.println("开始执行异步调用  可接收参数以及返回值  "+name);
            Thread.sleep(5000);
            return new AsyncResult<>(String.format(" 可接收参数以及返回值 异步执行调用成功 , %s", name));
        }catch (Exception e){
            return new AsyncResult<>(String.format("可接收参数以及返回值 异步执行调用异常 原因==== , %s", e.getMessage()));
        }

    }

}
