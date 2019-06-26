package com.learning.effective_java.eight;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author kian
 * @date 2019/6/21
 */
public class SetList2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1aaa");
        list.add("2lll");
        list.add("3eee");
        list.add("1www");
        list.add("2333");
        list.add("5fff");
        list.add("2333");
        System.out.println(list);
        list.removeIf(s -> s.startsWith("2"));
        System.out.println(list);

        Random random = new Random();
        System.out.println(random.nextInt());
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        System.out.println(threadLocalRandom.nextInt());
//        NoSuchElementException
    }
}
