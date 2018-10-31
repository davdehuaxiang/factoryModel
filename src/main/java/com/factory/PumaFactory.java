package com.factory;

import com.Brand;
import com.Puma;

/**
 * Created by sc on 2018/10/31.
 */
public class PumaFactory implements Factory {
    @Override
    public Brand getBrand() {
        return new Puma();
    }
}
