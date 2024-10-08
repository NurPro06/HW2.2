import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк для списка А:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        System.out.println("Список А: " + listA);

        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка Б:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        System.out.println("Список Б: " + listB);

        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("Список C (объединенный): " + listC);

        listC.sort(Comparator.comparingInt(String::length));

        System.out.println("Список C (отсортированный по длине): " + listC);
    }
}