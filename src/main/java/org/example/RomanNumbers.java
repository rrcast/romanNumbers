package org.example;


import java.util.HashMap;
import java.util.TreeMap;

/**
 So, create a project on a publicly hosted git repository (e.g. github) and implement:



 With any integer, show the roman numeral;

 With any roman numeral, show the integer.



 Please at least do part 1 (at most up to 3000) and if it's still fun and you've got time, feel free to go on to part 2.



 Don't worry about how far you get... we're more interested in you reaching the point of a well factored Part 1 that goes to 100 than a hacked together Part 1 & 2 that goes to 3000.”
 */
public class RomanNumbers {
    public final static TreeMap<Integer,String> romanNumbers = new TreeMap<>(){{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};


    public static void main(String[] args) {

       System.out.println("Hi");

    }

    public static String intToRoman(int num){
        return "";
    }
    public static int romanToInt(String romanNum){
        return 0;
    }
}
