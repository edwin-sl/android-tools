package com.stochasticstudio.utils.pattern.observer;

/**
 * Created by edwin on 1/26/2016.
 */
public interface Observer {
    //method to update the observer, used by catalogo
    void update();

    //attach with catalogo to observe
    void setSubject(Subject sub);
}
