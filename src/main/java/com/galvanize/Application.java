package com.galvanize;

import java.util.HashMap;

public class Application {

    public static void main(String[] args) {
        System.out.print(convert(args[0]));
    }

    public static int convert(String num) {
        int total = 0;

        HashMap<String, Integer> converter = new HashMap<String, Integer>();
        converter.put("I", 1);
        converter.put("V", 5);
        converter.put("X", 10);
        converter.put("L", 50);
        converter.put("C", 100);
        converter.put("D", 500);
        converter.put("M", 1000);

        System.out.println(converter);

        int previous = 100000;

        for (int i = 0; i < num.length(); i++) {
            if (converter.get(String.valueOf(num.charAt(i))) > previous) {
                total += converter.get(String.valueOf(num.charAt(i))) - (previous * 2);
            } else {
                total += converter.get(String.valueOf(num.charAt(i)));
            }

            previous = converter.get(String.valueOf(num.charAt(i)));

        }

        return total;
    }

}
