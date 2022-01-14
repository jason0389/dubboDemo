package com.jason;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        context.start();
        HelloService helloService = context.getBean("helloService", HelloService.class);
        int i=100;
        while(i-->0){
            // Test who is the provider
            String hello = helloService.hello("dubbo~~~~~~~~~~~");
            System.out.println(hello);
            Thread.sleep(500);
        }


    }

}
