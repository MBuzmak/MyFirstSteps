public class Weekend {
    public static String checkWeekend(String weekday){
        boolean isWeekend = weekday.equals("Saturday")||weekday.equals("Sunday");
        String answer = isWeekend ? "Ура, выходной!" : "Надо еще поработать...";
        return answer;
    }
}
