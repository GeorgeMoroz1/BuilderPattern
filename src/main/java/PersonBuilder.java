public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст указан некорректно!");
        }
        if (name == null){
            throw new IllegalStateException("Имя не указано!");
        }
        if (surname == null){
            throw new IllegalStateException("Фамилия не указана!");
        }
        return new Person(this);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
