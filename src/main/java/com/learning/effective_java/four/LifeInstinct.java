package com.learning.effective_java.four;

public interface LifeInstinct {

    void eat();
    default void breathe(){
        System.out.println("every animal need breathe");
    }
}
