package com.learning.effective_java.two;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;

/**
 * 普通单例模式，考虑序列化对单例模式的影响
 * 单例模式下不该有set方法？（自我体会）
 * @author kkf7688
 */
public class Elvis implements Serializable {
    private static Elvis ourInstance = new Elvis();

    public static Elvis getInstance() {
        return ourInstance;
    }

    /**
     * 如果依赖readResolve进行实例控制，带有对象引用类型的所有实例域必须为transient
     */
    private transient String[] favoriteSongs = {"Hound Dig","HeartBroker Hotel"};

    //在序列化情况，这样当JVM从内存中反序列化地"组装"一个新对象时,
    /**
     * 就会自动调用这个 readResolve方法来返回我们指定好的对象了,单例规则也就得到了保证.
     */
    private Object readResolve(){
        return ourInstance;
    }

    private Elvis() {
    }

    public void leaveTheBuilding(){
        System.out.println("this is Elvis singleton! you need to consider serializable class!");
    }


}
