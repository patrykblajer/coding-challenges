package training;

class OnlyNeedOne {

    public static void main(String[] args) {
        var result = check(new Object[]{66, 101}, 66);
        System.out.println(result);
    }

    public static boolean check(Object[] a, Object x) {
        for (Object o : a) {
            if (x.equals(o)) {
                return true;
            }
        }
        return false;
    }
}