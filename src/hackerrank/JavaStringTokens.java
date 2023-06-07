import java.util.Scanner;

class JavaStringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] splits = S.split("[^a-zA-Z]");
        int counter = 0;

        for (final String split : splits)
            if (split.length() > 0)
                counter++;

        System.out.println(counter);

        for (final String split : splits)
            if (split.length() > 0)
                System.out.println(split);
    }
}