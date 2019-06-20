package com.learning.effective_java.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author kian
 * @date 2019/6/20
 */
public class SetList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i=-3;i<3;i++){
            set.add(i);
            list.add(i);
        }

        for (int i=0;i<3;i++){
            set.remove(i);
            /**
             * 由于重载第一个是移除指定参数 list.remove(Integer.valueOf(i));，
             * 第二个是移除指定下标
             */

            list.remove(i);
        }
        System.out.println(set+"  "+list);
    }
}
