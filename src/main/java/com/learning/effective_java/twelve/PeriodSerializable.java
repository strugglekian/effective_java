package com.learning.effective_java.twelve;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kian
 * @date 2019/6/27
 */
public class PeriodSerializable implements Serializable {

    private final Date start;
    private final Date end;

    public PeriodSerializable(Date start, Date end) {
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

    private static class SerializableProxy implements Serializable {
        private final Date start;
        private final Date end;

        SerializableProxy(PeriodSerializable period) {
            this.start = period.start();
            this.end = period.end();
        }

        private Object readResolve(){
            return new PeriodSerializable(start,end);
        }

    }

    private Object writeReplace(){
        return new SerializableProxy(this);
    }

}
