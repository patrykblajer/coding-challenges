package coderbyte;

class ExOh {
    public static void main(String[] args) {

        System.out.println(exOh("xooxxxxooxo"));
    }

    public static boolean exOh(String str) {
        int counterX = 0;
        int counterO = 0;

        for (char c : str.toCharArray()) {
            if (c == 'x') {
                counterX++;
            } else if (c == 'o') {
                counterO++;
            }
        }

        return counterO == counterX;
    }
}