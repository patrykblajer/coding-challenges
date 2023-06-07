import java.time.LocalDate;

class JavaDateAndTime {
    public static void main(String[] args) {
        var result = findDay(8, 5, 2015);
        System.out.println(result);
    }

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().name();
    }
}