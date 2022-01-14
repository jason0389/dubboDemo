package com.jason;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String msg) {
        System.out.println("客户端传过来的信息:" + msg);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(calendar.getTime());
        return "服务端返回的信息：" + msg+",我是provider2" + ",当前时间：" + currentTime;
    }
}
