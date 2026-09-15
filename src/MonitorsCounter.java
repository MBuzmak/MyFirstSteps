public class MonitorsCounter {

    public int drawsMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }

    public static void main(String[] args) {
        MonitorsCounter method = new MonitorsCounter();
        int lish = method.drawsMonitorsCounter(5, 15);
        System.out.println("Мониторов осталось:" + lish);
    }
}