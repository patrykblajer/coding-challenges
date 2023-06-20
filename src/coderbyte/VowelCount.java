package coderbyte;

import java.util.Arrays;
import java.util.List;

class VowelCount {
    public static void main(String[] args) {
        System.out.println(vowelCount("quaaaaiizick"));
    }

    public static int vowelCount(String str) {
        List<Character> vowels = Arrays.asList('a', 'e', 'o', 'u', 'i');
        int counter = 0;

        for (char c : str.toCharArray()) {
            if (vowels.contains(Character.toLowerCase(c))) {
                counter++;
            }
        }
        return counter;
    }
}