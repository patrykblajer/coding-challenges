package coderbyte;

class MeanModeMostFrequentNumber {
    public static void main(String[] args) {
//        System.out.println(meanMode(new int[]{1, 2, 3}));
        System.out.println(meanMode(new int[]{4, 4, 4, 6, 2}));
    }

    public static int meanMode(int[] arr) {
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        int mean = sum / arr.length;
        int mostFreq = findMostFrequentNumber(arr);

        if (mean == mostFreq) {
            return 1;
        }
        return 0;
    }

    public static int findMostFrequentNumber(int[] array) {
        int mostFrequentNumber = array[0];
        int maxFrequency = 1;

        for (int i = 0; i < array.length; i++) {
            int frequency = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frequency++;
                }
            }

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentNumber = array[i];
            }
        }

        return mostFrequentNumber;
    }
}