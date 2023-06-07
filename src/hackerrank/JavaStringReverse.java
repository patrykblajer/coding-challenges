import java.util.Scanner;

class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String[] split = A.split("");

        boolean isSame = false;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equalsIgnoreCase(split[split.length - 1 - i])) {
                isSame = true;
            } else {
                isSame = false;
                break;
            }
        }
        if (isSame) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}