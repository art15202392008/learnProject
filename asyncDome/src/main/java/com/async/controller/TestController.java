package com.async.controller;


import com.async.util.AsyncTaskDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.Future;

/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/4/28 22:08
 * @Description 在异步中最好在service层中使用事务  不要在异步方法中使用事务
 */
@RestController
public class TestController {

    @Resource
    AsyncTaskDemo asyncTaskDemo;

    @GetMapping("testAsync")
    public String testAsyncMethods(){
        asyncTaskDemo.test1();
        return  "SUCCESS";
    }

    @GetMapping("testAsync1")
    public String testAsyncMethods1(){
        asyncTaskDemo.test2("测试");
        return  "SUCCESS";
    }

    /**
     *
     * @author wenyi
     * @param []
     * @return java.lang.String
     * @date 2019/4/28 22:18
     * @Description 调用有返回值异步   依然会从上往下执行
    */
    @GetMapping("testAsync12")
    public String testAsyncMethods2(){
        Future<String> future = asyncTaskDemo.test3("测试");
        try {
            String arr= future.get();
            System.out.println(arr);
            return "SUCCESS";
        }catch (Exception e){
            return  "ERROR";
        }

    }

}
