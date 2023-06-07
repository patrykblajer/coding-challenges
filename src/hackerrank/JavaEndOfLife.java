import java.util.Scanner;

class JavaEndOfLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (scanner.hasNext()) {
            counter++;
            String output = scanner.nextLine();
            System.out.println(counter + " " + output);
        }
    }
}