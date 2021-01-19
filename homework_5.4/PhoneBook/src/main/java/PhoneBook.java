package main.java;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {
    TreeMap<String, String> phoneBook = new TreeMap<>();

    public void addContact(String name, String phone) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        phoneBook.put(phone, name);
        System.out.println("Контакт добавлен!");

    }

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return phoneBook.getOrDefault(phone, null);
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        TreeSet<String> contactInfo = new TreeSet<>();
        if (phoneBook.containsValue(name)) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (entry.getValue().contains(name))
                    contactInfo.add(entry.getKey());
            }
        }
        return contactInfo;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> contactList = new TreeSet<>();
        for (Map.Entry<String, String> entry: phoneBook.entrySet()) {
            Set<String> listPhones = getPhonesByName(entry.getValue());
            StringBuilder phones = new StringBuilder();
            int i = 0;
            for (String str : listPhones) {
                phones.append(i++ > 0 ? ", " : "").append(str);
            }
            contactList.add(entry.getValue() + " - " + phones);
        }
        if (contactList.size() > 0) {
            for (String list : contactList) {
                System.out.println(list);
            }
            return contactList;
        } else {
            System.out.println("Список пуст");
            return new TreeSet<>();
        }
    }

}