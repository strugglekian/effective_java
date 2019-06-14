package com.learning.effective_java.five;

import java.lang.annotation.Annotation;

/**
 * Class<? extends Annotation> annotationType 第三十三条，说这个状态使非受检的，是这个意思不？
 * @author kian
 * @date 2019/6/14
 */
public class Favorities {
    public <T extends Annotation> T getAnnotation(Class<? extends Annotation> annotationType) {
        try {
            return (T) annotationType.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
