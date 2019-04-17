package com.redis.util;


/**  
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/4/17 20:10
 * @Description     原创  徐刘根
 */  
public class ThreadA extends  Thread{
    private Service service;

    public ThreadA(Service service){
        this.service  = service;
    }

    @Override
    public void run(){
        service.seckill();
    }


}
