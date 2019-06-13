package com.learning.effective_java.four;

import org.junit.Test;

/**
 * @author kian
 * @date 2019/6/12
 */
public class CatTest {

    @Test
    public void testCat(){
        Cat cat = new Cat();
        cat.eat();
        cat.breathe();
    }
}
