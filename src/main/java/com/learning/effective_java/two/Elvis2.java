package com.learning.effective_java.two;

/**
 *枚举类型的单例模式，绝对防止多次实例化，无偿提供了序列化的机制。注意，如果要扩展超类的时候，不宜采用这个方法。
 * @author kian
 */

public enum Elvis2 {
    /**
     * 枚举单例模式
     */
    INSTANCE;

    /**
     * 枚举类型默认构造函数就是private修饰的，既默认就是单例模式
     */
    Elvis2(){

    }

    public void leaveTheBuilding(){
        System.out.println("this is Elvis enum singleton!");
    }
}
