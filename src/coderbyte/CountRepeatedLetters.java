package coderbyte;

class CountRepeatedLetters {

    public static void main(String[] args) {
        String sentence = "Helo world! Good morning!";
        String word = findWordWithMostRepeatedLetters(sentence);
        System.out.println("Word with the most repeated letters: " + word);
    }

    public static String findWordWithMostRepeatedLetters(String sentence) {
        String[] words = sentence.split("\\s+");

        String result = "";
        int maxRepeatedLetters = 0;

        for (String word : words) {
            int repeatedLetters = countRepeatedLetters(word);
            if (repeatedLetters > maxRepeatedLetters) {
                maxRepeatedLetters = repeatedLetters;
                result = word;
            }
        }

        return result;
    }

    public static int countRepeatedLetters(String word) {
        int count = 0;
        word = word.toLowerCase();

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c) && word.indexOf(c) != word.lastIndexOf(c)) {
                count++;
            }
        }

        return count;
    }
}