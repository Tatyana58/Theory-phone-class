public class PhoneBook {

    private final Contact[] contacts;
    // Объявили массив Contact, реализуемый в классе Contact
    private int size;
    // Объявили свойство size (размер)

    public PhoneBook() {
        this.contacts = new Contact[10];
        // Задали массиву Contact длину — 10
    }

    // Реализуем метод addContact (создать контакт):
    public void addContact(String contactNick, String phone) {
        if (size >= contacts.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        Contact newContact = new Contact(contactNick, phone);
        contacts[size++] = newContact;
    }

    // Реализуем метод removeContact (удалить контакт)
    // Метод сдвигает массив влево на ячейку, удаляя ячейку под номером i
    public void removeContact(String contactNick) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getNick().equals(contactNick)) {
                System.out.println(contacts[i].getNick() + " удален");
                System.arraycopy(contacts, i + 1, contacts, i, size - i - 1);
                contacts[size - 1] = null;
                size--;
                return;
            }
        }
    }

    // Реализуем метод findContact (найти контакт)
    public void findContact(String contactNick) {
        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            if (contact.getNick().equals(contactNick)) {
                System.out.println(contact.getNick() + ": " + contact.getPhone());
                return;
            }
        }
        System.out.println(contactNick + " не найден");
    }

    // Реализуем метод printAllContacts (распечатать все контакты)
    public void printAllContacts() {
        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            System.out.println(contact.getNick() + ": " + contact.getPhone());
        }
    }

    // Реализуем метод getCurrentSize (получить текущий размер)
    public int getCurrentSize() {
        return size;
    }
}
