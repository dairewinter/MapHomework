import java.util.HashMap;

public class Phonebook {
    private String name;
    private String surname;
    private String number;

    public Phonebook(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName(){
        return name+surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Фамилия: " + getSurname() + " " + ", имя: " + getName() + " " + ", номер телефона: " + getNumber() + "\n";
    }
}