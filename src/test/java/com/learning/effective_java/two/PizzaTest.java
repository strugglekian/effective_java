package com.learning.effective_java.two;

import org.junit.Test;


/**
 * @date 2019/6/8
 * @auther kian
 */
public class PizzaTest {

    @Test
    public void testPizza(){
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL).adding(NyPizza.Topping.SAUSAGE).adding(NyPizza.Topping.ONION).builder();
        Calzone calzone = new Calzone.Builder().adding(Pizza.Topping.HAM).sauceInstance().builder();
        System.out.println(nyPizza);
        System.out.println(calzone);
    }

}
