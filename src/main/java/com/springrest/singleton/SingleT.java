package com.springrest.singleton;

public class SingleT {
    private SingleT singleT = null;

    private SingleT(){}

    public SingleT getSingleT(){
        synchronized(SingleT.class) {
            if (singleT == null) {
                return new SingleT();
            } else {
                return singleT;
            }
        }
    }
}
