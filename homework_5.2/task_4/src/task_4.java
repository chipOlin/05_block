import java.util.ArrayList;
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
                        case "ADD"    -> {
                            String toDo;
                            if (matcher.group(2) == null) {
                                System.out.println("Вы не задали название делу!");
                                continue;
                            } else toDo = matcher.group(2).trim();
                            System.out.println(addToDoList(command, toDo));
                        }
                        case "EDIT"   -> {
                            String toDo;
                            if (matcher.group(2) == null) {
                                System.out.println("Вы не задали название делу!");
                                continue;
                            } else toDo = matcher.group(2).trim();
                            System.out.println(editToDoList(command, toDo));
                        }
                        case "DELETE" -> System.out.println(deleteToDoList(command));
                        default -> System.out.println("Команда не найдена!");
                    }
                }
            } else System.out.println("Команда не найдена!");
        }
        in.close();
        System.out.println("Программа завершила работу!");
    }

    private static String deleteToDoList(String[] command) {
        if (command.length > 1) {
            int index = Integer.parseInt(command[1]);
            if (index < toDoList.size()) toDoList.remove(index);
        }
        return "Дело удалено!";
    }

    private static String editToDoList(String[] command, String text) {
        if (command.length > 1) {
            int index = Integer.parseInt(command[1]);
            if (index < toDoList.size()) toDoList.set(index, text);
        }
        return "Изменение внесено!";
    }

    private static String addToDoList(String[] command, String text) {
        if (command.length > 1) {
            int index = Integer.parseInt(command[1]);
            if (index < toDoList.size()) toDoList.add(index, text);
            else toDoList.add(text);
        } else {
            toDoList.add(text);
        }
        return "Дело добавлено!";
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
