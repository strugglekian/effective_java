package com.learning.effective_java.three;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * @author kian
 * @date 2019/6/11
 */
public class Rectangle extends AbstractFigure {

    private int width;
    private int length;

    @Override
    void area() {
        System.out.println(width * length);
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
   Map a;
}
