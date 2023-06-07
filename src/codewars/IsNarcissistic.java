package codewars;

class IsNarcissistic {

    public static boolean isNarcissistic(int number) {

        int result = 0;
        int digits = 0;
        int numberToCountDigits = number;
        int numberToGetResult = number;


        while (numberToCountDigits > 0) {
            numberToCountDigits /= 10;
            digits++;
        }

        int counter = digits;

        while (counter > 0) {
            result += Math.pow(numberToGetResult % 10, digits);
            numberToGetResult /= 10;
            counter--;
        }
        return result == number;
    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
        System.out.println(isNarcissistic(1634));
    }

}