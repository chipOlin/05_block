import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        List<String> carsNumber = new ArrayList<>();
        //final String[] carLetters = new String[] {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        final String[] carLetters = new String[] {"Х", "У", "Т", "С", "Р", "О", "Н", "М", "К", "Е", "В", "А"};
        for (String letter : carLetters) {
            for (int num = 0; num < 10; num++) {
                for (String letter_2 : carLetters) {
                    for (String letter_3 : carLetters) {
                        for (int reg = 1; reg <= 199; reg++) {

                            String numberCar = String.format("%s%d%d%d%s%s%03d", letter, num, num, num, letter_2, letter_3, reg);
                            carsNumber.add(numberCar);
                        }
                    }
                }
            }
        }
        return carsNumber;
    }

    static ArrayList<Long> bruteForceSearch = new ArrayList<>();
    static ArrayList<Long> binarySearch = new ArrayList<>();
    static ArrayList<Long> hashSetSearch = new ArrayList<>();
    static ArrayList<Long> treeSetSearch = new ArrayList<>();

    public static long averageTime(ArrayList<Long> search){
        long sum =0;
        for (long i : search){
            sum += i;
        }
        return sum/ search.size();
    }

    public static void statisticsShow(){

        TreeMap<Long, String> statistics = new TreeMap<>();

        statistics.put((CoolNumbers.averageTime(CoolNumbers.bruteForceSearch)), "среднее время поиска перебором = ");
        statistics.put((CoolNumbers.averageTime(CoolNumbers.binarySearch)), "среднее время бинарного поиска = ");
        statistics.put((CoolNumbers.averageTime(CoolNumbers.hashSetSearch)), "среднее время поиска в HashSet = ");
        statistics.put((CoolNumbers.averageTime(CoolNumbers.treeSetSearch)), "среднее время поиска в TreeSet = ");

        for (Long key: statistics.keySet()) {
            System.out.println(statistics.get(key) + key + " нс");
        }
    }

    public static void bruteForceSearchInList(List<String> list, String number) {
        long t = System.nanoTime();
        if (list.contains(number)) {
            long c = System.nanoTime() - t;
            bruteForceSearch.add(c);
            System.out.println("Поиск перебором: номер найден, поиск занял: " + c + "нс");
        }
    }

    public static void binarySearchInList(List<String> arrayList, String number) {
        long t = System.nanoTime();
        if (Collections.binarySearch(arrayList, number) >= 0) {
            long c = System.nanoTime() - t;
            binarySearch.add(c);
            System.out.println("Бинарный поиск: номер найден, поиск занял: " + c + "нс");
        }
    }


    public static void searchInHashSet(HashSet<String> hashSet, String number) {
        long t = System.nanoTime();
        if (hashSet.contains(number)) {
            long c = System.nanoTime() - t;
            hashSetSearch.add(c);
            System.out.println("Поиск в HashSet: номер найден, поиск занял: " + c + "нс");
        }
    }

    public static void searchInTreeSet(TreeSet<String> treeSet, String number) {
        long t = System.nanoTime();
        if (treeSet.contains(number)) {
            long c = System.nanoTime() - t;
            treeSetSearch.add(c);
            System.out.println("Поиск в TreeSet: номер найден, поиск занял: " + c + "нс");
        }
    }
}
