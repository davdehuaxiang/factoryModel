package com.simple;

/**
 * Created by sc on 2018/10/31.
 * 简单工厂
 */
public class Bootstrap {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getBrand("nike"));
    }
}
