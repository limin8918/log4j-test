package com.company;


import org.apache.log4j.PropertyConfigurator;

public class Main {

    public static void main(String[] args) {
        PropertyConfigurator.configure("./config/log4j.properties");

        System.out.print("abcd");
    }
}
