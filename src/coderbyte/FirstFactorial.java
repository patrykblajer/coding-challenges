package coderbyte;

class FirstFactorial {

    public static int firstFactorial(int num) {

        int result = 1;

        for (int i = num; i > 0; i--) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstFactorial(4));
        System.out.println(firstFactorial(8));
    }

}