public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException(Integer.toString(age));
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (name == null) {
            throw new IllegalStateException("В следующий раз не забудьте про имя!");
        } else if (surname == null) {
            throw new IllegalStateException("В следующий раз не забудьте про фамилию!");
        }
        Person newPerson = new Person(name, surname, age);
        newPerson.setAddress(address);
        return newPerson;
    }
}
