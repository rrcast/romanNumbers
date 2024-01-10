import org.example.RomanNumbers;
import org.junit.Test;

import static org.example.RomanNumbers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
/*

 So, create a project on a publicly hosted git repository (e.g. github) and implement:



 With any integer, show the roman numeral;

 With any roman numeral, show the integer.



 Please at least do part 1 (at most up to 3000) and if it's still fun and you've got time, feel free to go on to part 2.



 Don't worry about how far you get... we're more interested in you reaching the point of a well factored Part 1 that goes to 100 than a hacked together Part 1 & 2 that goes to 3000.”
 */


public class RomanNumbersTest {
    @Test
    public void testIntToRoman(){
    assertEquals("IV", RomanNumbers.intToRoman(4));
    assertEquals("XIV", RomanNumbers.intToRoman(14));
    assertEquals("", RomanNumbers.intToRoman(0));
    assertEquals("MC", RomanNumbers.intToRoman(1100));
    assertEquals("CM", RomanNumbers.intToRoman(900));
    assertEquals("XCIII", RomanNumbers.intToRoman(93));
    assertEquals("MXCIII", RomanNumbers.intToRoman(1093));
    assertEquals("MCMXCIII", RomanNumbers.intToRoman(1993));
    assertEquals("MMCMXCIX", RomanNumbers.intToRoman(2999));
    assertEquals("MMM", RomanNumbers.intToRoman(3000));



    }

    @Test
    public void testIntToRomanInvalidCases(){
        assertNotEquals("CCCC", RomanNumbers.intToRoman(400));
        assertNotEquals("XIIII", RomanNumbers.intToRoman(14));
        assertNotEquals("CXVI", RomanNumbers.intToRoman(140));

    }

    @Test
    public void testRomanToInt(){
        assertEquals(4, RomanNumbers.romanToInt("IV"));
        assertEquals(14, RomanNumbers.romanToInt("XIV"));
        assertEquals(0, RomanNumbers.romanToInt(""));
        assertEquals(1100, RomanNumbers.romanToInt("MC"));
        assertEquals(900, RomanNumbers.romanToInt("CM"));
        assertEquals(93, RomanNumbers.romanToInt("XCIII"));

    }
    @Test
    public void testRomanToIntInvalidCases(){
       // assertNotEquals(92, RomanNumbers.romanToInt("IXCIII")); need to modify logic for this case maybe with a flag to know if we already sum any value to the number we are trying to substract


    }



}
