public class MethodsOfDays {
    public static boolean isWeekend(String dayName) {
        switch (dayName) {
            case "Суббота", "Воскресенье": {
                return true;
            }
        }
        return false;
    }

    public static int weekendCounts(String[] days) {
        int count = 0;
        for (int x = 0; x < days.length; x++) {
            if (isWeekend(days[x])) {
                count++;
            }
        }
        return count;
    }

    public static int weekdayCounts(String[] days) {
        return days.length - weekendCounts(days);
    }
}
