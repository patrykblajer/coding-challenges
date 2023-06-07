package training;

class DRoot {

    public static void main(String[] args) {

        int r = digital_root(16);
        int r1 = digital_root(942);
        int r2 = digital_root(132189);
        int r3 = digital_root(493193);
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }

    public static int digital_root(int n) {
        if (n < 10) {
            return n;
        }
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return digital_root(sum);
    }
}