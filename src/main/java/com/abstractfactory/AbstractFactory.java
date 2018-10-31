package com.abstractfactory;

import com.Adidas;
import com.Nike;
import com.Puma;

/**
 * Created by sc on 2018/10/31.
 */
public abstract class AbstractFactory {

    public abstract Nike getNike();

    public abstract Adidas getAdidas();

    public abstract Puma getPuma();
}
