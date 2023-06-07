package codewars;

class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        var split = name.split(" ");
        return split[0].toUpperCase().charAt(0) + "." + split[1].toUpperCase().charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
    }


}