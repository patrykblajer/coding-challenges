package training;

class TotalPoints {

    public static int points(String[] games) {
        int resultA = 0;
        for (String game : games) {
            var pointA = game.charAt(0);
            var pointB = game.charAt(2);
            if (pointA > pointB) {
                resultA += 3;
            } else if (pointB == pointA) {
                resultA += 1;
            }
        }
        return resultA;
    }
}