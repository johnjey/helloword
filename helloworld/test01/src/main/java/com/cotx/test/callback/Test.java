package com.cotx.test.callback;

public class Test {
    private MyCallInterface myCallInterface;
    public static void main(String[] args) {
        Caller caller = new Caller();
        caller.setCallInterface(new MyCallInterface() {
            @Override
            public void printName() {
                System.out.println("jonjey");
            }
        });
        caller.call();
        //new Test().init();
    }

    /*public void init(){
        myCallInterface=new MyCallInterface() {
            @Override
            public void printName() {
                System.out.println("heheh");
            }
        };
    }*/
}
