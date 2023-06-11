package codewars;

class NearestFibonacci {

    public static void main(String[] args) {
        nearestFibonacci(0);
        nearestFibonacci(17);
    }

    static void nearestFibonacci(int num) {

        if (num == 0) {
            System.out.println(0);
            return;
        }

        int first = 0, second = 1;


        int third = first + second;

        while (third <= num) {
            first = second;


            second = third;

            third = first + second;
        }

        int ans = (Math.abs(third - num) >= Math.abs(second - num)) ? second : third;

        System.out.println(ans);
    }
}