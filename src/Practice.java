public class Practice {
    public static class Student {
        public boolean studying;

        public void study() {
            System.out.println("Учусь.");
        }
    }

    public static class JavaStudent extends Student {
        public void study() {
            System.out.println("Я очень занят. Прохожу курс по Java.");
        }
    }

    public static class LazyStudent extends Student {
        @Override
        public void study() {
            System.out.println("Сегодня не учусь, мне лень.");
        }
    }
}
