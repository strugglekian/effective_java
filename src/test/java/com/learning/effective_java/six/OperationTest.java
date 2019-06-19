package com.learning.effective_java.six;

import org.junit.Test;


/**
 * @author kian
 * @date 2019/6/14
 */
public class OperationTest {
    @Test
    public void testOperation() {
        System.out.println(Operation.DEVICE.apply(2.0, 4.0));
        Class<Operation> c = null;
        try {
            c = (Class<Operation>) Class.forName("com.learning.effective_java.six.Operation");
            for (Operation o : c.getEnumConstants()) {
                System.out.println(o.name()+o);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
