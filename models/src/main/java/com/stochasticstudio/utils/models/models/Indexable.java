package com.stochasticstudio.utils.models.models;


/**
 * Created by edwin on 2/6/2016.
 */
public interface Indexable {
    Object getIndex();
    boolean matchIndex(Object index);
}
