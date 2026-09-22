public class Day {
    enum DAY {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    DAY today = DAY.MONDAY;

    public boolean isWeekend() {
        switch (today) {
            case SATURDAY, SUNDAY -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    public String getRusName() {
        switch (today) {
            case MONDAY -> {
                return "ПОНЕДЕЛЬНИК";
            }
            case TUESDAY -> {
                return "ВТОРНИК";
            }
            case WEDNESDAY -> {
                return "СРЕДА";
            }
            case THURSDAY -> {
                return "ЧЕТВЕРГ";
            }
            case FRIDAY -> {
                return "ПЯТНИЦА";
            }
            case SATURDAY -> {
                return "СУББОТА";
            }
            case SUNDAY -> {
                return "ВОСКРЕСЕНЬЕ";
            }
        }
        return "Другой день!";
    }

}