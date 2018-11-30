package com.cotx.test.callback;

public class Caller {
    private MyCallInterface callInterface;

    public Caller() {}

    public void setCallInterface(MyCallInterface callInterface) {
        this.callInterface = callInterface;
    }

    public void call(){
        callInterface.printName();
    }
}
