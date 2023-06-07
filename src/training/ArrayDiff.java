package training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ArrayDiff {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{})));


    }


    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().toList();
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }
}