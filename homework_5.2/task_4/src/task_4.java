import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();

        System.out.print("Введите команду: ");
        while (true) {
            String inRow = in.nextLine();
            if (inRow.isEmpty()) break;

            final String regex = "(^[a-zA-Z]+\\s?\\d?)(.+)";
            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(inRow);

            if (matcher.find()) {
                System.out.println(matcher.group(1));
                System.out.println(matcher.group(2));
                String[] command = matcher.group(1).trim().split("\\s");
                if (command.length > 0) {
                    switch (command[0]) {
                        case "LIST"   -> System.out.println("List");
                        case "ADD"    -> System.out.println("Add");
                        case "EDIT"   -> System.out.println("Edit");
                        case "DELETE" -> System.out.println("Delete");
                        default -> System.out.println("switch Команда не распознана, попробуйте снова!");
                    }
                }
                System.out.println(Arrays.toString(command));
                /*System.out.println("Full match: " + matcher.group(0));
                for (int i = 1; i <= matcher.groupCount(); i++) {
                    System.out.println("Group " + i + ": " + matcher.group(i).trim());
                }*/
            } else System.out.println("find Команда не распознана, попробуйте снова!");
            /*String command = in.nextLine();
            if (!command.isEmpty()) {
                switch (command) {
                    case "LIST":
                        System.out.println("List");
                        break;
                    case "ADD":
                        System.out.println("Add");
                        break;
                    case "EDIT":
                        System.out.println("Edit");
                        break;
                    case "DELETE":
                        System.out.println("Delete");
                        break;
                    default:
                        break;
                }
            } else break;*/
        }
        in.close();
        System.out.println("Программа завершила работу!");
    }
}
