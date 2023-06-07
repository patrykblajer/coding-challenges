import java.util.Scanner;

class JavaSubstringComparisons {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();


        String smallest = "";
        String largest = "";

        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            list.add(s.substring(i, i + k));
        }

        for (String value : list) {
            if (value.compareTo(largest) > 0) {
                largest = value;
            }
        }
        smallest = largest;
        for (String value : list) {

            if (smallest.compareTo(value) > 0) {
                smallest = value;
            }
        }
        System.out.println(list);
        System.out.print(smallest + "\n" + largest);

        scan.close();
    }
}