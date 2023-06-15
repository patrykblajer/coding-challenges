package coderbyte;

import java.util.Arrays;

class AlphabetSoup {

    public static void main(String[] args) {
        System.out.println(alphabetSoup("coderbyte"));
    }

    public static String alphabetSoup(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}