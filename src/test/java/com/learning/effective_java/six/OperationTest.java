package com.learning.effective_java.six;

import org.junit.Test;

/**
 * @author kian
 * @date 2019/6/14
 */
public class OperationTest {
    @Test
    public void testOperation(){
        System.out.println(Operation.DEVICE.apply(2.0,4.0));
    }
}
