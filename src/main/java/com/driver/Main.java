package com.driver;

public class Main {
    public static void main(String[] args) {
          RWOnly a = new RWOnly();
//        a.name = "Amol";
//        System.out.println(a.name);
        a.setName("Amol");
        System.out.println(a.getName());
    }
}