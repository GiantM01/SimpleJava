package com.devon;

public class VariableOverflow {
    public static void main(String[] args){
        int a =130;
        byte b = (byte)a;
        System.out.println(a);
        System.out.println(b);
    }
}
