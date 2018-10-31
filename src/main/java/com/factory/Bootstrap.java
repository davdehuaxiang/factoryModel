package com.factory;

/**
 * Created by sc on 2018/10/31.
 */
public class Bootstrap {

    public static void main(String[] args) {
        Factory factory=new NikeFactory();
        System.out.println(factory.getBrand());
    }
}
