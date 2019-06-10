package com.learning.effective_java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class EffectiveJavaApplicationTests {

    @Test
    public void contextLoads() {
        LinkedHashMap<String,String> map = new LinkedHashMap<>();

        int size = 0;
        int[] element = new int[16];
        for (int i = 0; i < 16; i++) {
            element[size++] = i;
            System.out.println("size:" + size + ";i:" + i+";element:");
        }

        for (int j = 15; j >= 0; j--) {
            System.out.println(element[--size]);
            System.out.println("size:"+size+";j:"+j+"element:"+element[size]);
        }
    }

}
