package coderbyte;

import java.util.ArrayList;
import java.util.List;

class LetterCapitalize {
    public static void main(String[] args) {
        System.out.println(letterCapitalize("hello world"));
    }

    public static String letterCapitalize(String str) {
        var words = str.split(" ");
        List<String> list = new ArrayList<>();
            for (String word : words) {
                list.add(word.substring(0, 1).toUpperCase() + word.substring(1));

        }
        return String.join(" ", list);
    }
}