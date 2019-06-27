package com.learning.effective_java.twelve;

import java.util.Date;

/**
 * 50条，进行保护性拷贝
 * @author kian
 * @date 2019/6/27
 */
public class Period {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(start + "after" + end);
        }
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }



}
