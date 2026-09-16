public class Days {
    public static int isWeekend(String weekday){
        switch (weekday){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                return (5);
            case "Saturday":
            case "Sunday":
                return (3);
        }
        return 0;
    }
}
