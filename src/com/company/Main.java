package com.company;

public class Main {

    public static void main(String[] args) {
	    // this is our main method. It's the entry point for our application.
        // this method is a function it is a static method inside of the Main class
        // we can declare our own static methods and invoke them throughout this class (and outside of this class, but we will learn about this later)
        printHello();

        System.out.println(getValue());

        // when you invoke a method you can provide an argument, you must make sure the data type you pass it matches the defined parameter type
        printSomeInteger(10);
    }

    // this method does not have a return statement and therefore does not return anything hence the void keyword
    public static void printHello() {
        System.out.println("Hello there");
    }

    // methods may have a return statement if so you must declare the type of data that will be returned from the method
    public static double getValue() {
        return 15.5;
    }

    // methods can define parameters if so you must declare the type of all parameters
    public static void printSomeInteger(int theValue) {
        System.out.println("The value is: " + theValue);
    }
}
