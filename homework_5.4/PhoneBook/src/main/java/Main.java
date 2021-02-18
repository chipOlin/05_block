package main.java;

import part1.java.Part1;

import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        Part1 p1 = new Part1("some text");
        System.out.println(p1.text);

        /*PhoneBook phoneBook = new PhoneBook();

        final String regex = "([LIST]+)?\\s?([А-Яа-яA-Za-z]+)?\\s?([87]+\\d{10})?";
        final Pattern pattern = Pattern.compile(regex);

        System.out.println("Введите номер, имя или команду:");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            if (Pattern.matches(regex, input)) {
                final Matcher matcher = pattern.matcher(input);

                if (matcher.find()) {
                    boolean command = matcher.group(1) != null;
                    String name = matcher.group(2) != null ? matcher.group(2).trim() : "";
                    String phone = matcher.group(3) != null ? matcher.group(3).trim() : "";
                    if (command) {
                        phoneBook.getAllContacts();
                    } else if (name.length() > 0 && phone.length() > 0) {
                        phoneBook.addContact(name, phone);
                    } else if (name.length() > 0) {
                        Set<String> listPhones = phoneBook.getPhonesByName(name);
                        if (listPhones.isEmpty()) {
                            System.out.println("Такого имени в телефонной книге нет.\n" +
                                    "Введите номер телефона для абонента “" + name + "”:");
                            String newPhoneNumber = scanner.nextLine();
                            phoneBook.addContact(name, newPhoneNumber);
                        } else {
                            System.out.println("Номера телефона для абонента “" + name + "”:");
                            int i = 0;
                            for (String str : listPhones) {
                                System.out.print((i++>0 ? ", " : "") + str);
                            }
                            System.out.println();
                        }

                    } else if (phone.length() > 0) {
                        String getName = phoneBook.getNameByPhone(phone);
                        if (getName == null) {
                            System.out.println("Такого телефона в телефонной книге нет.\n" +
                                    "Введите имя абонента “" + phone + "”:");
                            String newName = scanner.nextLine();
                            phoneBook.addContact(newName, phone);
                        } else {
                            System.out.println(getName);
                        }
                    }
                }
            } else {
                System.out.println("Неверный формат ввода");
            }
        }
        scanner.close();
        System.out.println("Программа завершила работу!");*/
    }
}