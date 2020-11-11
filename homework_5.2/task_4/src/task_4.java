import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_4 {
    public static ArrayList<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите команду: ");
        while (true) {
            String inRow = in.nextLine();
            if (inRow.isEmpty()) break;

            final String regex = "(^[a-zA-Z]+\\s?\\d?)(.+)?";
            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(inRow);

            if (matcher.find()) {
                String[] command = matcher.group(1).trim().split("\\s");
                if (command.length > 0) {
                    switch (command[0]) {
                        case "LIST"   -> System.out.println(getToDoList());
                        case "ADD"    -> System.out.println(addToDoList(command, matcher.group(2).trim()));
                        case "EDIT"   -> System.out.println(editToDoList(command, matcher.group(2).trim()));
                        case "DELETE" -> System.out.println(deleteToDoList(command)
                                                            ? "Дело удалено!"
                                                            : "Ошибка удаления");
                        default -> System.out.println("no_switch!");
                    }
                } else System.out.println("no_command!");
            } else System.out.println("no_find!");
        }
        in.close();
        System.out.println("Программа завершила работу!");
    }

    private static boolean deleteToDoList(String[] command) {
        //System.out.println(Arrays.toString(command));
        Object o = new int[Integer.parseInt(command[1])];
        return toDoList.remove(o);
    }

    private static String editToDoList(String[] command, String text) {
        return null;
    }

    private static String addToDoList(String[] command, String text) {
        if (text.length() > 0) {
            if (command.length > 1) {
                int index = Integer.parseInt(command[1]);
                if (index <= toDoList.size()) toDoList.add(index, text);
                else toDoList.add(text);
            } else {
                toDoList.add(0, text);
            }
            return "Дело добавлено!";
        } else return "Вы не дали название делу";
    }

    private static String getToDoList() {
        if (toDoList.size() > 0) {
            StringBuilder list = new StringBuilder();
            for (int i =0; i < toDoList.size(); i++) {
                if (i != 0) list.append("\n");
                list.append(i).append(" - ").append(toDoList.get(i));
            }
            return String.valueOf(list);
        } else {
            return("Список дел пуст!");
        }
    }
}
