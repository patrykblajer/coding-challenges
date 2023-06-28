package coderbyte;

class QuestionMarks {
    public static void main(String[] args) {
        System.out.println(questionMarks("acc?7??sss?3rr1??????5"));
        System.out.println(questionMarks("aa6?9"));
    }

    public static String questionMarks(String str) {
        Integer lastNum = null;
        int questionCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                if (lastNum != null && num + lastNum == 10) {
                    if (questionCount != 3) {
                        return "false";
                    }
                    questionCount = 0;
                }
                lastNum = num;
            } else if (c == '?') {
                questionCount++;
            }
        }

        return "true";
    }
}