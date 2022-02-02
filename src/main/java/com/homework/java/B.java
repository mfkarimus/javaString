package com.homework.java;

public class B {
    public static void main(String[] args) {
        A a =new A();
        a.sum();
        a.sub();
        a.mul();
        a.Div();

//static method
        C.sum();
        C.sub();
        C.mul();
        C.Div();

//paramitarized method
        D d =new D();
        d.sum(10,20);
        d.sub(10,20);
        d.mul(10,20);
        d.Div(10,20);

    }
}
