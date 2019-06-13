package com.learning.effective_java.four;

/**
 * @author kian
 * @date 2019/6/12
 */
public class Super {
    public Super() {
        overrideMe();
        System.out.println(2);
    }


    public void overrideMe() {
        System.out.println(1);
    }
}
