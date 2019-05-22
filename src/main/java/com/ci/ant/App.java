package com.ci.ant;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World !");
    }

    public static Boolean estBissextile(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
