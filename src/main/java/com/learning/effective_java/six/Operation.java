package com.learning.effective_java.six;


/**
 * 用具体的方法覆盖每个常量的抽象方法，这种方法被称作特定于常量的方法实现
 * 枚举于抽象方法.枚举实现接口，同样的效果。详情第38条
 *
 * @author kian
 * @date 2019/6/14
 */
public enum Operation {
    /**
     * 加
     */
    PULS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    }, MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    }, TIMES("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    }, DEVICE("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x, double y);

}
