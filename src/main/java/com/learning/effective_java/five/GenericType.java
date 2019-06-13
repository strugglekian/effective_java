package com.learning.effective_java.five;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author kian
 * @date 2019/6/13
 */
public class GenericType<E> {

    private ArrayList<String> stringList = new ArrayList<>();

    public static void add(List<String> list, String s) {
        list.add(s);
    }

    /**
     *
     * @param s1
     * @param s2
     * @param <E> 如果E是Number,Set里面只能存Number
     * @return
     */
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    /**
     *
     * @param s1
     * @param s2
     * @param <E> 如果E是Number，set里面可以存int,double,float
     * @return
     */
    public static <E> Set<E> union2(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}
