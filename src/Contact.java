public class Contact {
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
