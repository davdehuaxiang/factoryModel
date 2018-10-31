package com.abstractfactory;

import com.Adidas;
import com.Nike;
import com.Puma;

/**
 * Created by sc on 2018/10/31.
 */
public class Factory extends AbstractFactory {
    @Override
    public Nike getNike() {
        return new Nike();
    }

    @Override
    public Adidas getAdidas() {
        return new Adidas();
    }

    @Override
    public Puma getPuma() {
        return new Puma();
    }
}
