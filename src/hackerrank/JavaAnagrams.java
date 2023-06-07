import java.util.Scanner;

class JavaAnagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        String x = a.toLowerCase();
        String y = b.toLowerCase();

        if (x.length() == y.length()) {
            int[] arrX = new int[256];
            int[] arrY = new int[256];
            for (int i = 0; i < x.length(); i++) {
                arrX[x.charAt(i)] += 1;
                arrY[y.charAt(i)] += 1;
                System.out.println(arrX[x.charAt(i)]);
                System.out.println(arrY[y.charAt(i)]);
            }
            for (int i = 0; i < 256; i++) {
                if (arrX[i] != arrY[i])
                    return false;
            }
            return true;
        } else {
            return false;
        }
    }
}