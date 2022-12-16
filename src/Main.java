public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иванов Иван0", "89250000000");
        phoneBook.addContact("Иванов Иван1", "89250000001");
        phoneBook.addContact("Иванов Иван2", "89250000002");
        phoneBook.addContact("Иванов Иван3", "89250000003");
        phoneBook.addContact("Иванов Иван4", "89250000004");
        phoneBook.printAllContacts();
        // Распечатываем все контакты
        System.out.println("Размер тел. книги: " + phoneBook.getCurrentSize());
        // Распечатываем размер телефонной книги
        System.out.println();

        phoneBook.findContact("Иванов Иван4");
        // Ищем контакт Иванов Иван4
        System.out.println();

        phoneBook.removeContact("Иванов Иван4");
        // Удаляем контакт Иванов Иван4
        phoneBook.findContact("Иванов Иван4");
        // Ищем контакт Иванов Иван4
        phoneBook.printAllContacts();
        // Снова распечатываем все контакты
        System.out.println("Размер тел. книги: " + phoneBook.getCurrentSize());
        // Снова распечатываем размер телефонной книги
    }
}