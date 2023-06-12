package coderbyte;

class SimpleAdding {
    public static void main(String[] args) {
        System.out.println(simpleAdding(140));
        System.out.println(simpleAdding(12));

    }

    public static int simpleAdding(int num) {
        int result = 0;
        for (int i = num; i >= 0; i--) {
            result += i;

        }
        return result;
    }
}