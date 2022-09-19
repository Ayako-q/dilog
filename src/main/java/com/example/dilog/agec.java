package com.example.dilog;
import java.util.Scanner;

public class agec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi, user, please enter your age:");
        int uage = in.nextInt();
        if(uage < 7){
            System.out.println("Oh, so you are in kindergarten!");
        }
        else if(uage > 6 && uage < 18){
            System.out.println("Oh, so you are learning in school!");
        }
        else if(uage>=18 && uage<=22){
            System.out.println("So you are studying at University");
        }
        else if(uage > 22 && uage < 66){
            System.out.println("SO you have a job");
        }
        else{
            System.out.println("So that means you are retired");
        }
        System.out.println("Thank you! That is all I needed, have a good day!");
    }
}
