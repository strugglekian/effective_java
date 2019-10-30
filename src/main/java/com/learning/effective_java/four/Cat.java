package com.learning.effective_java.four;

/**
 * java8中加入default修饰接口，是为了接口可以添加额外的方法，而不用实现类去实现。很大的一个作用就是对lambda的支持。
 * 但是也有可能现有接口不支持新的default方法，所以维护人员不得不重写default方法
 * @author kian
 * @date 2019/6/12
 */
public class Cat implements LifeInstinct{
    @Override
    public void eat() {
        System.out.println("cat like fish");
    }

}
