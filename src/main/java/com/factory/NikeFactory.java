package com.factory;

import com.Brand;
import com.Nike;

/**
 * Created by sc on 2018/10/31.
 */
public class NikeFactory implements Factory {
    @Override
    public Brand getBrand() {
        return new Nike();
    }
}
