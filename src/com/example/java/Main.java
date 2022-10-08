package com.example.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        int myVar=2;
        float myVarFloat=2.36f;
        System.out.println(myVar);
        System.out.println(myVarFloat);
        double doubleValue=5588585.65d;
        Double doubleObj= new Double(doubleValue);
        System.out.println(doubleValue);
        System.out.println(doubleObj);
        byte byteValue=doubleObj.byteValue();
        int intValue= doubleObj.intValue();
        float floatValue= doubleObj.floatValue();
        String stringValue=doubleObj.toString();
        System.out.println(byteValue);
        System.out.println(intValue);
        System.out.println(stringValue);
        System.out.println(floatValue);



    }
}