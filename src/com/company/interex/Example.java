package com.company.interex;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;

        InterfaceB ib = impl;

        InterfaceC ic = impl;

        ic.methodA();
        ic.methodB();
        ic.methodC();



    }
}
