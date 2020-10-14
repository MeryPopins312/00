package com.company;

public class Main {

    public static void main(String[] args) {
    }
    public static void walk(int temp, int age) {
        age=67;
        temp=0;
        if ((age >= 20 && age < 45) && (temp >= -20 && temp < 30)) {
            System.out.println("Можно идти гулять");
            return;

        }
        if (age<20  &&(temp >=0 && temp <28)){
            System.out.println("Можно идти гулять");
            return;
        }
        if (age>45 && (temp > -10 && temp <25)){
            System.out.println("Можно идти гулять");
            return;
        }
        else {
            System.out.println("Оставайтесь дома");
            return;
        }
    }




}
