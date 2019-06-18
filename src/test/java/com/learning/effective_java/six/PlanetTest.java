package com.learning.effective_java.six;

import org.junit.Test;

/**
 * @author kian
 * @date 2019/6/14
 */
public class PlanetTest {

    @Test
    public void testPlanet(){
        System.out.println(Planet.EARTH.getMass());
        for (Planet p:Planet.values()){
            System.out.printf("planet mass %s,radius %s%n",p.getMass(),p.getRadius());
        }
    }
}
