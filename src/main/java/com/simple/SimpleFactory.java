package com.simple;

import com.Adidas;
import com.Brand;
import com.Nike;

/**
 * Created by sc on 2018/10/31.
 */
public class SimpleFactory {

    public Brand getBrand(String name){
        if("nike".equals(name)){
            return new Nike();
        }else if("adidas".equals(name)){
            return new Adidas();
        }else if("puma".equals(name)){

        }else{
            return null;
        }
        return null;
    }
}
