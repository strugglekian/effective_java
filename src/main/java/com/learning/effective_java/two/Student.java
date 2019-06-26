package com.learning.effective_java.two;

import lombok.ToString;

import java.util.Objects;

/**
 *构造器，当
 * @date 2019/6/7
 * @auther kang
 */
@ToString
public class Student {

    private final String name;
    private final Integer age;
    private final String father;
    private final String mother;
    private final Integer height;

    public static class Builder {
        //可选的参数
        private String name;
        private Integer age;
        private Integer height;

        //必须的参数
        private final String father;
        private final String mother;

        public Builder(String father, String mother) {
            this.father = Objects.requireNonNull(father);
            this.mother = Objects.requireNonNull(mother);
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        private Student build() {
            return new Student(this);
        }
    }

    private Student(Builder builder) {
        this.father = builder.father;
        this.mother = builder.mother;
        this.age = builder.age;
        this.height = builder.height;
        this.name = builder.name;
    }
}
