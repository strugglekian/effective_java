package com.learning.effective_java.four;

import java.time.Instant;
import java.util.List;

/**
 * 1.构造器绝对不能调用可被覆盖的方法。第一次父类调用overrideMe的时候会打印null，因为此时instant还没有被初始化
 * 2.可以通过构造器调用private,final,static修饰的方法，因为这些方法都是不可以被覆盖的
 * @author kian
 * @date 2019/6/12
 */
public class Sub extends Super {
    private final Instant instant;

    Sub() {
        super();
        instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

}
