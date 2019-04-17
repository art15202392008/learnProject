package com.redis.util;

/**  
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/4/17 20:13
 * @Description  原创  徐刘根
 */  
public class Test {

    public static void main(String[] args) {
        Service service = new Service();
        for(int i=0;i<50;i++){
            ThreadA threadA  = new ThreadA(service);
            threadA.start();
        }
    }
}
