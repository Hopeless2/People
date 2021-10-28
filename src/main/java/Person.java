import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;
    protected boolean hasAge = false;
    protected boolean hasAddress = false;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        hasAge = true;
    }

    public PersonBuilder newChildBuilder() throws IllegalArgumentException {
        PersonBuilder pb = new PersonBuilder()
                .setAddress(address)
                .setAge(0)
                .setSurname(surname);
        return pb;
    }

    public boolean isHasAge() {
        return hasAge;
    }

    public boolean isHasAddress() {
        return hasAddress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        hasAddress = true;
    }

    public void happyBirthday() {
        age = age + 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
