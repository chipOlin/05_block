import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Random;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {

        List<String> list = CoolNumbers.generateCoolNumbers();
        List<String> arrayList = new ArrayList<>(list);
        HashSet<String> hashSet = new HashSet<>(list);
        TreeSet<String> treeSet = new TreeSet<>(list);

        System.out.println("Введите количество итераций: ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {

                String number = list.get(new Random().nextInt(list.size()));
                System.out.println(number);

                CoolNumbers.bruteForceSearchInList(list, number);
                CoolNumbers.binarySearchInList(arrayList, number);
                CoolNumbers.searchInHashSet(hashSet, number);
                CoolNumbers.searchInTreeSet(treeSet, number);
            }

            System.out.println("\nУсредненные значения от меньшего к большему: ");
            CoolNumbers.statisticsShow();
        }
    }
}
