package training;

import java.util.Arrays;

class ReversedSequence {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverse(5)));
    }

    public static int[] reverse(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = n - i;
        return res;
    }
}