import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        var us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        var india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        var china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        var france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}