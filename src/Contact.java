import java.util.Objects;
/* public class Contact {
    private final String nick;
    // Объявили свойство nick (никнейм)
    private String phone;
    // Объявили свойство phone (номер телефона)

    public Contact(String nick, String phone) {
        this.nick = nick;
        this.phone = phone;
    }

    public String getNick() {
        return nick;
        // Создали геттер для nick
    }

    public String getPhone() {
        return phone;
        // Создали геттер для phone
    }

    public void setPhone(String phone) {
        this.phone = phone;
        // Создали сеттер для phone
    }
}
 */

public class Contact {
    private final String nick;
    private String phone;

    public Contact(String id, String phoneNumber) {
        this.nick = id;
        this.phone = phoneNumber;
    }

    public String getNick() {
        return nick;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Contact c2 = (Contact) other;
        return nick.equals(c2.nick);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nick);
    }

    @Override
    public String toString() {
        return nick + ": " + phone;
    }
}