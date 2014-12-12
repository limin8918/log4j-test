package com.company;


import org.apache.log4j.PropertyConfigurator;

public class Main {

    public static void main(String[] args) {
        PropertyConfigurator.configure("./config/log4j.properties");

        TestA a = new TestA();
        a.outputLog();

        TestB b = new TestB();
        b.outputLog();

        TestC c = new TestC();
        c.outputLog();

        System.out.print("finish");
    }
}
