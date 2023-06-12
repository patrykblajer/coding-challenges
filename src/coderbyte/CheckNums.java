package coderbyte;

class CheckNums {
    public static void main(String[] args) {
        System.out.println(checkNums(3, 122));
    }

    public static String checkNums(int num1, int num2) {
        return num1 == num2 ? "-1" : String.valueOf(num2 > num1);
    }
}