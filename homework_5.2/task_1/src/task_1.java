import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();

        System.out.print("Введите команду: ");
        while (in.hasNextLine()) {
            final String regex = "(^[a-zA-Z]+\\s?\\d?)(.+)";
            final String string = in.nextLine();

            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(string);

            while (matcher.find()) {
                System.out.println("Full match: " + matcher.group(0));
                for (int i = 1; i <= matcher.groupCount(); i++) {
                    System.out.println("Group " + i + ": " + matcher.group(i).trim());
                }
            }
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
        System.out.println("Программа завершила работу!");
    }
}
