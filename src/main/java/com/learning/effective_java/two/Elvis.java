package com.learning.effective_java.two;

import java.io.Serializable;

public class Elvis implements Serializable {
    private static Elvis ourInstance = new Elvis();

    public static Elvis getInstance() {
        return ourInstance;
    }

    //如果依赖readResolve进行实例控制，带有对象引用类型的所有实例域必须为transient
    private transient String[] favoriteSongs = {"Hound Dig","HeartBroker Hotel"};

    //在序列化情况，这样当JVM从内存中反序列化地"组装"一个新对象时,
    // 就会自动调用这个 readResolve方法来返回我们指定好的对象了,单例规则也就得到了保证.
    private Object readResolve(){
        return ourInstance;
    }

    private Elvis() {
    }
}
