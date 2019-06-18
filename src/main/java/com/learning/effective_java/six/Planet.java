package com.learning.effective_java.six;

/**
 * 枚举类型是不可变类，构造函数默认private 修饰，类名为final修饰
 *
 * @author kkf7688
 */

public enum Planet {
    /**
     * 地球
     */
    EARTH(5.975e+23, 6.378e6), MARS(6.419e+23, 3.393e6);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
