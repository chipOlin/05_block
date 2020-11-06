import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String phrase = "Каждый охотник желает знать, где сидит фазан";

        String[] wordsPhrase = phrase.split(",?\\s+");
        System.out.println("Первоначальный массив: " + Arrays.toString(wordsPhrase));
        for (int i = 0; i < wordsPhrase.length / 2; i++) {
            String temp = wordsPhrase[i];
            wordsPhrase[i] = wordsPhrase[wordsPhrase.length - 1 - i];
            wordsPhrase[wordsPhrase.length - 1 - i] = temp;
        }
        System.out.println("Перевернутый массив: " + Arrays.toString(wordsPhrase));
    }
}
