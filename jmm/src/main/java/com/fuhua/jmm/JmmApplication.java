package com.fuhua.jmm;

import bat.ke.qq.com.HashMap;
import org.openjdk.jol.info.ClassLayout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmmApplication {

    public static void main(String[] args) {

        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
       // SpringApplication.run(JmmApplication.class, args);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

    }

}
