package training;

class FakeBinary {

    public static void main(String[] args) {
        System.out.println(fakeBin("366058562030849490134388085"));
    }

    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();
        for (char c : numberString.toCharArray()) {
            result.append(Character.getNumericValue(c) < 5 ? "0" : "1");
        }
        return result.toString();
    }
}