class Cars {
    static class Car implements AutoCloseable {
        public void close() {
            System.out.println("Машина закрывается...");
        }

        public void drive() {
            System.out.println("Машина поехала.");
        }

    }

    static void main() {
        try (Car car = new Car()) {
            car.drive();
        } catch (RuntimeException e) {
        }
    }
}
