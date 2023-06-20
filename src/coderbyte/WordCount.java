package coderbyte;

class WordCount {

    public static void main(String[] args) {
        System.out.println(wordCount("Hello World"));
    }

    public static int wordCount(String str) {
        return str.trim().split("\\s+").length;
    }
}