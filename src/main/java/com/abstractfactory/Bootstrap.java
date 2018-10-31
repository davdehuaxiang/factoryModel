package com.abstractfactory;

import java.sql.PseudoColumnUsage;

/**
 * Created by sc on 2018/10/31.
 */
public class Bootstrap {

    public static void main(String[] args) {
        AbstractFactory factory=new Factory();
        System.out.println(factory.getAdidas());
    }
}
