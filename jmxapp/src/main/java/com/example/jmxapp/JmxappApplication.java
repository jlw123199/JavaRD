package com.example.jmxapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

@SpringBootApplication
public class JmxappApplication {

    public static void main(String[] args) throws MalformedObjectNameException {

        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("test:type=User");
        User userMBean = new User();
        userMBean.setUserName("Jack");

        mBeanServer.registerMBean(userMBean, name);

        Thread.sleep(Long.MAX_VALUE);


        SpringApplication.run(JmxappApplication.class, args);
    }

}
