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
        put(0, "");
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

    public final static HashMap<Character,Integer> intValues = new HashMap<>(){{
        put(' ', 0);
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);

    }};


    public static void main(String[] args) {

       System.out.println("Hi");

    }

    public static String intToRoman(int num){
        int floor = romanNumbers.floorKey(num); //getting floor in the tree, Returns the greatest key less than or equal to the given key
        if(num == floor){
            //2
            return romanNumbers.get(num); //if floor and nub are equal we just need to return the key, we don't need more iterations
        }
        return romanNumbers.get(floor) + intToRoman(num-floor);// we return the current floor and concatenate the result of an iteration less the floor
    }                                           // 2
    public static int romanToInt(String romanNum){
        int result=0;
        int temp=0;
        for (int i= romanNum.length()-1; i>=0;i--){
            int currentNumbe= intValues.get( romanNum.charAt(i));
            if(currentNumbe<temp){
                result-=currentNumbe;
            }else{
                result += currentNumbe;
            }
            temp = currentNumbe;
        }




        return result;
    }


    public static boolean validatePostCode(String romanNum){
        String[] stringArray = romanNum.split(" ");


        if (!stringArray[0].matches("^[a-zA-Z].*")||!stringArray[1].matches("^[1-9].*")) {
            return false;
        }




        return true;
    }
}
