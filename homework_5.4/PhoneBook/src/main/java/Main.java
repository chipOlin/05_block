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
                String inName = newContact[0];
                String inPhone = newContact[1];
                phoneBook.addContact(inPhone, inName);
            }
        }
        scanner.close();
        System.out.println("Программа завершила работу!");
    }
}
