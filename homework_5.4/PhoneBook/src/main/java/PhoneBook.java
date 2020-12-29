package main.java;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    TreeMap<String, String> phoneBook = new TreeMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        final String regexName = "\\D+";
        final String regexPhone = "[78]\\d{10}";
        if (Pattern.matches(regexPhone, phone)) {
            System.out.println("Формат номера телефона подходит");
        }
        if (Pattern.matches(regexName, name)) {
            System.out.println("Формат имени подходит");
        }
        phoneBook.put(phone, name);
    }

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        String contactInfo = null;
        if (phoneBook.containsKey(phone)) {
            contactInfo = phoneBook.get(phone) + " - " + phone;
        }
        return contactInfo;
        /*
        String s = null;
        if (phoneBook.containsValue(phone)) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (entry.getValue().contains(phone))
                    s = "Found " + phone + " in " + entry.getKey();
            }
        } else s = "not exist";
        return s;*/
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> contactList = new TreeSet<>();
        for (Map.Entry<String, String> entry: phoneBook.entrySet()) {
            contactList.add(entry.getValue() + " - " + entry.getKey());
        }
        if (contactList.size() > 0) {
            for (String list : contactList) {
                System.out.println(list);
            }
            return contactList;
        } else {
            return new TreeSet<>();
        }
    }
}