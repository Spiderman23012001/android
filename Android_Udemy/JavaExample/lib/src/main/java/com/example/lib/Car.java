package com.example.lib;

public class Car {
//    state
    private int year;
    private int speed;

    // Methods
    protected void accelerate(){
        speed +=10;
        System.out.println("Your new Speed is: "+ speed);
    }
    protected void brake(){
        speed -=5;
        System.out.println("Your new Speed is: "+ speed);
    }
    public Car(int CarSpeed, int Caryear){
        year = Caryear;
        speed = CarSpeed;
    }
    public int getYear(){
        return year;
    }
    public int getSpeed(){
        return speed;
    }
    public void setYear(int year1){
        year = year1;
    }
    public void setSpeed(int speed1){
        speed = speed1;
    }

}
