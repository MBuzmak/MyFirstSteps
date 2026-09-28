import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Programm {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.remove(i);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}