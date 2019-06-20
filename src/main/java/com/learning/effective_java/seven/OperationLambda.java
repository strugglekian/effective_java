package com.learning.effective_java.seven;

import java.util.TreeMap;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Predicate;

/**
 * 枚举lambda表达式
 * @author kian
 * @date 2019/6/20
 */
public enum OperationLambda {
    /**
     * 加
     */
    PULS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DEVICE("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator doubleBinaryOperator;

    OperationLambda(String symbol, DoubleBinaryOperator doubleBinaryOperator) {
        this.symbol = symbol;
        this.doubleBinaryOperator = doubleBinaryOperator;
    }

    @Override
    public String toString() {
        return symbol;
    }

    /**
     * 在枚举里面用lambda表达式实现了DoubleBinaryOperator
     * @param x 参数
     * @param y 参数
     * @return 调用lambda表达式，返回结果
     */
    public double apply(double x, double y) {
        return doubleBinaryOperator.applyAsDouble(x, y);
    }
}
