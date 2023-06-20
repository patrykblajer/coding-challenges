package coderbyte;

class ABCheck {
    public static void main(String[] args) {

        System.out.println(aBCheck("bzzza"));
    }

    public static boolean aBCheck(String str) {

        for (int i = 0; i < str.length() - 4; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i + 4) == 'b'
                    || str.charAt(i) == 'b' && str.charAt(i + 4) == 'a') {
                return true;
            }
        }
        return false;
    }
}