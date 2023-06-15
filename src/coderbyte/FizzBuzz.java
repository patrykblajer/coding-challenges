package coderbyte;

class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(8));

    }

    public static String fizzBuzz(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                sb.append("FizzBuzz ");
            } else if (i % 3 == 0) {
                sb.append("Fizz ");
            } else if (i % 5 == 0) {
                sb.append("Buzz ");
            } else {
                sb.append(i).append(" ");
            }
        }
        return sb.toString().trim();
    }
}