package codewars;

class LongestWord {

    public static String longestWord(String sen) {
        var replaced = sen.replaceAll("\\p{Punct}", "");
        String[] split = replaced.split(" ");
        String biggest = split[0];
        for (String s : split) {
            if (s.length() > biggest.length()) {
                biggest = s;
            }
        }
        return biggest;
    }


    public static void main(String[] args) {
        System.out.println(longestWord("fun&!! time"));
        System.out.println(longestWord("I love dogs"));
    }
}