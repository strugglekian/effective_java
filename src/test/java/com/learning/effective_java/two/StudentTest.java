package com.learning.effective_java.two;

import org.junit.Test;



/**
 * @date 2019/6/7
 * @auther kang
 */
public class StudentTest {

    @Test
    public void testGetStudentInstance() {
        Student student = new Student.Builder("Mr Kang", "Mrs Bei").age(28).height(175).name("kian").build();
        Student s2 = new Student.Builder("Mr Kang", "Mrs Bei").age(29).height(174).build();
        System.out.println(student.toString());
        System.out.println(s2);
    }

}
