package com.factory;

import com.Adidas;
import com.Brand;

/**
 * Created by sc on 2018/10/31.
 */
public class AdiFactory implements Factory{

    @Override
    public Brand getBrand() {
        return new Adidas();
    }
}
