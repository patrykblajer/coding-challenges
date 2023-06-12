package coderbyte;

class FindIntersection {
    public static void main(String[] args) {
        System.out.println(findIntersection(new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));
        System.out.println(findIntersection(new String[]{"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}));


    }

    public static String findIntersection(String[] strArr) {
        String[] firstArray = strArr[0].split(", ");
        String[] secondArray = strArr[1].split(", ");
        StringBuilder result = new StringBuilder();
        for (String e1 : firstArray)
            for (String e2 : secondArray) {
                if (e1.equals(e2)) result.append(e1).append(",");
            }

        if (result.length() > 1) {
            return result.substring(0, result.length() - 1);
        } else return "false";
    }
}