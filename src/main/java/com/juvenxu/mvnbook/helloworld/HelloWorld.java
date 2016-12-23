package com.juvenxu.mvnbook.helloworld;

/**
 * Created by lh on 16-12-23.
 */
public class HelloWorld  implements Test{
    public String sayHello() {
        return "Hello Maven";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHello());
    }

    @Override
    public double calculate(int a) {
        return 0;
    }

    @Override
    public double sqrt(int a) {
        return 0;
    }
}
