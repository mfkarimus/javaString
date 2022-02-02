package com.homework.java;

public class student {
    public static void main(String[] args) {
        int marks=100;

        if(marks>=80 && marks<=100){
            System.out.println("This result is excellent and grade point A+");
        }
        else if(marks>=70 && marks<79){
            System.out.println("This result is very good and grade point A");
        }
        else if(marks>=60 && marks<60){
            System.out.println("This result is good and grade point A minus");
        }
        else if(marks>=50 && marks<59){
            System.out.println("This result is not bad and grade point B");

        }else if(marks>=40 && marks<49){
            System.out.println("This result is bad and grade point C");
        }else{
            System.out.println("This result is very bad and fail");
        }
    }
}



