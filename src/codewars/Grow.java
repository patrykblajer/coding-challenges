package codewars;

class Grow {
    public static void main(String[] args) {
        System.out.println(grow(new int[]{1, 2, 3}));

    }

    public static int grow(int[] x) {
        int sum = 1;
        for (int i : x) {
            sum *= i;
        }
        return sum;
    }
}