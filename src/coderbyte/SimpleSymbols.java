package coderbyte;

class SimpleSymbols {
    public static void main(String[] args) {
        System.out.println(simpleSymbols("+d+=3=+s+"));
        System.out.println(simpleSymbols("f++d+"));

    }

    public static String simpleSymbols(String str) {
        char[] charArray = str.toCharArray();

        if (Character.isLetter(charArray[0]) || Character.isLetter(charArray[charArray.length - 1]))
            return "false";

        for (int i = 1; i < charArray.length - 1; i++) {
            if (Character.isLetter(charArray[i]) && (charArray[i - 1] != '+' || charArray[i + 1] != '+')) {
                return "false";
            }
        }
        return "true";
    }
}