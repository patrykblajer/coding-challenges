package coderbyte;

class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("eye"));
        System.out.println(palindrome("never odd or even"));
    }

    public static boolean palindrome(String str) {

        var array = str.replace(" ", "").toCharArray();

        for (int i = 0; i < array.length / 2; i++) {
            char j = array[array.length - 1 - i];
            if (array[i] != j) {
                return false;
            }
        }
        return true;
    }
}