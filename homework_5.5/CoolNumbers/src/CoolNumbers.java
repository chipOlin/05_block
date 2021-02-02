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
                            String numberCar = String.format("%s%d%d%d%s%s%+03d", letter, num, num, num, letter_2, letter_3, reg);
                            //System.out.println(numberCar);
                            list.add(numberCar);
                        }
                    }
                }
            }
        }
        System.out.println(list.size());
        return list;
        //return Collections.emptyList();
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        Collections.sort(list);
        if (list.contains(number)) {
            System.out.println("Поиск перебором: номер найден, поиск занял: " + System.nanoTime() + "нс");
        } else {
            System.out.println("Поиск перебором: номер не найден, поиск занял: " + System.nanoTime() + "нс");
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        if (Collections.binarySearch(sortedList, number) == 0) {
            System.out.println("Бинарный поиск: номер найден, поиск занял: " + System.nanoTime() + "нс");
        } else {
            System.out.println("Бинарный поиск: номер не найден, поиск занял: " + System.nanoTime() + "нс");
        }
        return false;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        if (hashSet.contains(number)) {
            System.out.println("Поиск в HashSet: номер найден, поиск занял: " + System.nanoTime() + "нс");
        } else {
            System.out.println("Поиск в HashSet: номер не найден, поиск занял: " + System.nanoTime() + "нс");
        }
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        if (treeSet.contains(number)) {
            System.out.println("Поиск в TreeSet: номер найден, поиск занял: " + System.nanoTime() + "нс");
        } else {
            System.out.println("Поиск в TreeSet: номер не найден, поиск занял: " + System.nanoTime() + "нс");
        }
        return false;
    }

}
