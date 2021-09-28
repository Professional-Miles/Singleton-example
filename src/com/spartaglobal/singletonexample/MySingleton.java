package com.spartaglobal.singletonexample;

public class MySingleton {

    private static MySingleton theInstance;
    private MySingleton() {

    }

    public static MySingleton getInstance(){
        if(theInstance == null)
            theInstance = new MySingleton();
        return theInstance;
    }
}
