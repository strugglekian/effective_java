package com.learning.effective_java.two;

import lombok.ToString;

/**
 * @data 2019/6/8
 * @auther kian
 */
@ToString
public class Calzone extends Pizza {

    private final boolean sauceInside;
    public static class Builder extends Pizza.Builder<Builder> {

        private boolean sauceInside = false;

        public Builder sauceInstance() {
            sauceInside = true;
            return this;
        }

        @Override
        Calzone builder() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }


    private Calzone(Builder builder) {
        super(builder);
        this.sauceInside=builder.sauceInside;
    }
}
