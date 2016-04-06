package com.stochasticstudio.utils.pattern.observer;

/**
 * Created by edwin on 1/26/2016.
 */
public interface Subject {
    //methods to register and unregister observers
    void register(Observer obj);
    void unregister(Observer obj);

    //method to notify observers of change
    void notifyObservers();

    //method to get updates from catalog
    Object getUpdate(Observer obj);
}
