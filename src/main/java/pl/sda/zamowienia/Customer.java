package pl.sda.zamowienia;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private String email;

    public Customer(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException {
        if(Character.isUpperCase(Integer.parseInt(name))){
            this.name = name;
        } else {
            throw new NameException("Nieprawidłowa wielkość liter");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NameException {
        if(age >= 18) {
            this.age = age;
        } else {
            throw new NameException("Wiek musi być większy lub równy 18");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
