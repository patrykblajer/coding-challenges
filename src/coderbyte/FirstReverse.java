package coderbyte;

class FirstReverse {
    public static void main(String[] args) {
        System.out.println(firstReverse("coderbyte"));
        System.out.println(firstReverse("I Love Code"));
    }

    public static String firstReverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}