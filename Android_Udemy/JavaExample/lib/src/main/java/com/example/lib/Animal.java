package com.example.lib;

public class Animal {
    void makesound(){
        System.out.println("Lop cha");
    }
}
class dog extends Animal{
    @Override
    void makesound() {
        super.makesound();
        System.out.println("Lop con");
    }
}
