public class Dog {
    public static void sayHello() {
        System.out.println("Ав!");
    }

    public static void catchCat(Cat cat) {
        System.out.println("Кошка поймана!");
        Dog.sayHello();
        Cat.sayHello();
    }
}
