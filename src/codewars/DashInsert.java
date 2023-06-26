package codewars;

class DashInsert {

    public static void main(String[] args) {
        System.out.println(dashInsert("56730"));
    }

    private static String dashInsert(String number) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            char currentChar = number.charAt(i);
            result.append(currentChar);

            if (i < number.length() - 1) {
                char nextChar = number.charAt(i + 1);

                if (isOdd(currentChar) && isOdd(nextChar)) {
                    result.append("-");
                }
            }
        }

        return result.toString();
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}