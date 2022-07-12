package com.galvanize;

public class Application {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter a number");
        } else {
            System.out.println(fizzBuzz(Integer.parseInt(args[0])));
        }
    }

    public static String fizzBuzz(int num) {
        int i = num;
        String output = "";

        if (i % 3 == 0) {
            output += "Fizz";
        }
        if (i % 5 == 0) {
            output += "Buzz";
        }

        if (output.length() == 0) {
            return String.valueOf(i);
        } else {
            return output;
        }
    }

}
