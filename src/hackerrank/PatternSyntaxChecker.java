import java.util.Scanner;
import java.util.regex.*;

class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            if (pattern != null && !pattern.equals("")) {
                try {
                    Pattern.compile(pattern);
                    System.out.println("valid");
                } catch (PatternSyntaxException e) {
                    System.out.println("invalid");
                }
            }
            testCases--;
        }
    }
}