package training;

class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println(even_or_odd(3));
        System.out.println(even_or_odd(4));
    }

    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

}