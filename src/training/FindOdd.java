package training;

import java.util.HashMap;
import java.util.Map;

class FindOdd {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : a) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }

        return -1;
    }
}