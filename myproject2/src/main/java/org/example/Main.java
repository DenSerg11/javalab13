package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester;
        tester = new Tester("Денис", "");
        tester.printInfo();
        tester.method(1);
        tester.method(1, 2);
        tester.method(1, 2, 3);
        Tester.staticMethod();
    }
}