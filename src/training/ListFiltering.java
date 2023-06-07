package training;

import java.util.List;

class ListFiltering {

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).toList();
    }

}