public class Robot {
    enum Direction {
        UP, DOWN, RIGHT, LEFT
    }

    static Direction direction = Direction.UP;
    static int x = 0;
    static int y = 0;

    public void turnLeft() {
        switch (direction) {
            case UP -> direction = Direction.LEFT;
            case RIGHT -> direction = Direction.UP;
            case DOWN -> direction = Direction.RIGHT;
            case LEFT -> direction = Direction.DOWN;
        }
    }

    public static void turnRight() {
        switch (direction) {
            case UP -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.DOWN;
            case DOWN -> direction = Direction.LEFT;
            case LEFT -> direction = Direction.UP;
        }
    }

    public static void stepForward() {
        switch (direction) {
            case UP -> y++;
            case DOWN -> y--;
            case RIGHT -> x++;
            case LEFT -> x--;
        }
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void getDirection(int toX, int toY) {
        while (getX() < toX && !(direction == Direction.RIGHT)) {
            turnRight();
        }
        while (getX() > toX && !(direction == Direction.LEFT)) {
            turnRight();
        }
        while (getY() < toY && !(direction == Direction.UP)) {
            turnRight();
        }
        while (getY() > toY && !(direction == Direction.DOWN)) {
            turnRight();
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (getX() != toX || getY() != toY) {
            getDirection(toX, toY);
            stepForward();
        }
    }
}