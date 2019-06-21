package com.learning.effective_java.seven;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * @author kian
 * @date 2019/6/20
 */
public class Anagrams {
    public static void main(String[] args) {
        Collections.sort(Arrays.asList("123", "234"), Comparator.naturalOrder());
    }
}
