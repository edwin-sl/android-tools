package com.stochasticstudio.utils.models.models;

import com.stochasticstudio.utils.pattern.observer.Observer;
import com.stochasticstudio.utils.pattern.observer.Subject;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by edwin on 1/28/2016.
 */
public class Catalog<T extends Indexable> implements Subject {
    // catalog to be stored in memory
    public Set<T> catalogo = new HashSet<>();
    public final Set<Observer> observers = new HashSet<>();

    @Override
    public void register(Observer obj) {
        synchronized (observers) {
            observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (observers) {
            observers.remove(obj);
        }
    }

    @Override
    public synchronized void notifyObservers() {
        synchronized (observers) {
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return catalogo;
    }


    public T findObject(Object id){

        for(T obj : catalogo){
            if(obj.matchIndex(id))
                return obj;
        }

        return null;
    }
}
