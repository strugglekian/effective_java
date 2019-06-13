package com.learning.effective_java.four;

import java.io.ObjectStreamConstants;
import java.math.BigInteger;

/**
 * @implSpec
 * 数组被public修饰，是危险的，数组保存的对象容易被修改
 * 方法一：私有化数组，用公共方法用Collections.unmodifiableList()转化为数组返回，方法二：私有化数组，返回数组的clone
 * @author kian
 * @date 2019/6/11
 */
public class SecurityHole {
    public static final Integer[] VALUES = {1, 2, 3};

    public static void main(String[] args) {
       BigInteger.ONE.negate();
        /**
         * 作者说这个已经被废弃了
         */
       StringBuffer stringBuffer = new StringBuffer();
       StringBuilder stringBuilder = new StringBuilder();
    }
}
