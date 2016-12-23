package com.juvenxu.mvnbook.helloworld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by lh on 16-12-23.
 */
public class HelloWorldTest {
    @Test
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        assertEquals("Hello Maven", result);
    }
}
