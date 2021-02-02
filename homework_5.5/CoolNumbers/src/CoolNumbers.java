import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.List;

public class CoolNumbers {
    public static List<String> generateCoolNumbers() {
        List<String> list = new ArrayList<>();
        final String[] carLetters = new String[] {"А","В","Е","К","М","Н","О","Р","С","Т","У","Х"};
        for (String letter : carLetters) {
            for (int num = 0; num < 10; num++) {
                for (String letter_2 : carLetters) {
                    for (String letter_3 : carLetters) {
                        for (int reg = 1; reg <= 199; reg++) {
                            String numberCar = String.format("%s%d%d%d%s%s%02d", letter, num, num, num, letter_2, letter_3, reg);
                            list.add(numberCar);
                        }
                    }
                }
            }
        }
        return list;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        long time = System.nanoTime();
        if (list.contains(number)) {
            System.out.println("Поиск перебором: номер найден, поиск занял: " + (System.nanoTime() - time) + "нс");
            return true;
        } else {
            System.out.println("Поиск перебором: номер не найден, поиск занял: " + (System.nanoTime() - time) + "нс");
            return false;
        }
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        long time = System.nanoTime();
        if (Collections.binarySearch(sortedList, number) >= 0) {
            System.out.println("Бинарный поиск: номер найден, поиск занял: " + (System.nanoTime() - time) + "нс");
            return true;
        } else {
            System.out.println("Бинарный поиск: номер не найден, поиск занял: " + (System.nanoTime() - time) + "нс");
            return false;
        }
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        long time = System.nanoTime();
        if (hashSet.contains(number)) {
            System.out.println("Поиск в HashSet: номер найден, поиск занял: " + (System.nanoTime() - time) + "нс");
            return true;
        } else {
            System.out.println("Поиск в HashSet: номер не найден, поиск занял: " + (System.nanoTime() - time) + "нс");
            return false;
        }
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        long time = System.nanoTime();
        if (treeSet.contains(number)) {
            System.out.println("Поиск в TreeSet: номер найден, поиск занял: " + (System.nanoTime() - time) + "нс");
            return true;
        } else {
            System.out.println("Поиск в TreeSet: номер не найден, поиск занял: " + (System.nanoTime() - time) + "нс");
            return false;
        }
    }
}
