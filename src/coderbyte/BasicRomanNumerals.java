package coderbyte;

import java.util.HashMap;
import java.util.Map;

class BasicRomanNumerals {

    private static Map<Character, Integer> romanToArabicMap = new HashMap<>();

    static {
        romanToArabicMap.put('I', 1);
        romanToArabicMap.put('V', 5);
        romanToArabicMap.put('X', 10);
        romanToArabicMap.put('L', 50);
        romanToArabicMap.put('C', 100);
        romanToArabicMap.put('D', 500);
        romanToArabicMap.put('M', 1000);
    }

    public static void main(String[] args) {

        System.out.println(basicRomanNumerals("IV"));
        System.out.println(basicRomanNumerals("XLVI"));

    }

    public static int basicRomanNumerals(String str) {
        int arabicNumber = 0;
        int previousValue = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            char currentRomanChar = str.charAt(i);
            int currentValue = romanToArabicMap.get(currentRomanChar);

            if (currentValue < previousValue) {
                arabicNumber -= currentValue;
            } else {
                arabicNumber += currentValue;
                previousValue = currentValue;
            }
        }
        return arabicNumber;
    }
}