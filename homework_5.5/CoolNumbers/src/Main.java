import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {

        List<String> list = CoolNumbers.generateCoolNumbers();
        List<String> sortedList = new ArrayList<>(list);
        HashSet<String> hashSet = new HashSet<>(list);
        TreeSet<String> treeSet = new TreeSet<>(list);

        String number = "Е222ОВ193";

        CoolNumbers.bruteForceSearchInList(list ,number);
        CoolNumbers.binarySearchInList(sortedList ,number);
        CoolNumbers.searchInHashSet(hashSet,number);
        CoolNumbers.searchInTreeSet(treeSet,number);
    }
}
