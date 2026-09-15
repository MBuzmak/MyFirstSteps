public class Calculation {

    public double priceCalculation(double price, int count) {
        return price * count;
    }

    public static void main(String[] args) {
        Calculation method = new Calculation();
        double sum = method.priceCalculation(149.99, 20);
        System.out.println("Итого:" + sum);
    }
}
