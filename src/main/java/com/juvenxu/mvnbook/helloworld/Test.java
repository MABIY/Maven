package com.juvenxu.mvnbook.helloworld;

/**
 * Created by lh on 16-12-23.
 */
public interface Test {
    double calculate(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
