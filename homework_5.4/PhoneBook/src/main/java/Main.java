package main.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите команду: ");
        while (true) {
            String inRow = scanner.nextLine();
            if (inRow.isEmpty()) break;

            if (inRow.equals("LIST")) {
                phoneBook.getAllContacts();
            } else {
                String[] newContact = inRow.split("\\s");
                phoneBook.addContact(newContact[1], newContact[0]);
            }
        }
        scanner.close();
        System.out.println("Программа завершила работу!");
        //([LIST]+)?\s?([А-Я][а-я]+\s)\s?([87]?\s?\d{10})
    }
}
