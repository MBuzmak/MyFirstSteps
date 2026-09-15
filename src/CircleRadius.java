public class CircleRadius {

    public static double calcCircleRadius(double area) { //заменил void на double, так как по другому программа выдает ошибку
        return Math.sqrt(area / Math.PI);
    }

    public static void main(String[] args) {
        double r = calcCircleRadius(35);
        System.out.print("Радиус равен:");
        System.out.printf("%.3f", r);
    }
}
