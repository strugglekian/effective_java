package com.learning.effective_java.four;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author kian
 * @date 2019/6/11
 */
public class SecurityHoleTest {

    /**
     * 访问控制权限的重要，final修饰虽然SecurityHole.VALUES的引用不能被修改，但是它所引用的对象可以被改变
     * 另外在内存泄漏的时候有提到，数组比较特殊，先扩大后缩小，扩大以后的内存jvm不会回收，需要置为null
     */
    @Test
    public void testPublicFinal(){
       SecurityHole.VALUES[0]=5;
        System.out.println(Arrays.toString(SecurityHole.VALUES));
    }
}
