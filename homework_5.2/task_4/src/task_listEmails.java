import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_listEmails {
    public static void main(String[] args) {
        TreeSet<String> email = new TreeSet<>();

        System.out.println("Введите команду: ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            final String regex = "([A-Z]+)\\s?(.+@.+\\..+)?";
            final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            final Matcher matcher = pattern.matcher(input);

            if (Pattern.matches(regex, input)) {
                while (matcher.find()) {
                    String command = matcher.group(1).trim();
                    String text = matcher.group(2) != null ? matcher.group(2).trim() : "";

                    if (command.equals("ADD")) {
                        if (text.length() > 0) {
                            email.add(text);
                        }
                    }

                    if (command.equals("LIST")) {
                        if (email.size() > 0) {
                            int i = 0;
                            for (String list : email) {
                                System.out.println(i++ + " - " + list);
                            }
                        } else {
                            System.out.println("Список пуст!");
                        }
                    }
                }
            } else {
                System.out.println("Команда не задана или неправильно введен e-mail! Попробуйте заново!");
            }
        }
        scanner.close();
        System.out.println("Программа завершила работу!");
    }
}
