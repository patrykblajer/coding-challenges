package coderbyte;

import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.List;

class LetterChanges {

    public static void main(String[] args) {

        System.out.println(letterChanges("hello*3"));

    }

    static String letterChanges(String str) {
        String output = "";
        char letter;
        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);
            if (letter >= 'a' && letter < 'z') {
                letter++;
            }
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                letter = Character.toUpperCase(letter);
            }
            output = output + letter;
        }
        return output;
    }
}