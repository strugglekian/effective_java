package com.learning.effective_java.six;

import java.lang.annotation.Repeatable;
import java.util.Set;

/**
 * 私有嵌套枚举的应用
 *
 * @author kian
 * @date 2019/6/19
 */
public enum PayrollDay {
    /**
     * 一周工作枚举
     */
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FIRDAY,
    SATURDAY(PayType.WEEKDAY), SUNDAY(PayType.WEEKEND);
    private final PayType payType;
    PayrollDay() {
        this(PayType.WEEKDAY);
    }

    PayrollDay(PayType payType) {
        this.payType = payType;
    }


    /**
     * 枚举类型的时候，构造函数里面已经实现
     *
     * @param minutesWorked 工作时间
     * @param payRate       每分钟工资
     * @return 获取的工资数
     */
    int pay(int minutesWorked, int payRate) {
        return payType.pay(minutesWorked, payRate);
    }

    private enum PayType {
        /**
         * 加班双倍工资
         */
        WEEKDAY {
            @Override
            int overtimePay(int minutesWorked, int payRates) {
                return minutesWorked <= MINUTES_PER_SHIFT ? 0 : (minutesWorked - MINUTES_PER_SHIFT) * payRates * 2;
            }
        }, WEEKEND {
            @Override
            int overtimePay(int minutesWorked, int payRates) {
                return minutesWorked * payRates * 2;
            }
        };
        private final static int MINUTES_PER_SHIFT = 8 * 60;

        abstract int overtimePay(int minutesWorked, int payRates);

        int pay(int minutesWorked, int payRate) {
            int basePay = minutesWorked * payRate;
            return basePay + overtimePay(minutesWorked, payRate);
        }
    }
}
