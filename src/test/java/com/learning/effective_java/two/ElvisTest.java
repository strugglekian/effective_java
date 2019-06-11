package com.learning.effective_java.two;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author kian
 * @data 2019/6/10
 */
public class ElvisTest {

    @Test
    public void testElvisSingleton() {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }

    @Test
    public void testElvisEnumSingleton() {
        Elvis2 elvis2 = Elvis2.INSTANCE;
        elvis2.leaveTheBuilding();
    }

    @Test
    public void testInputstream() {
        try (InputStream inputStream = new FileInputStream("/df")) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
