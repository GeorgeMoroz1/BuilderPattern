

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        setAge(personBuilder.getAge());
        this.address = personBuilder.getAddress();
    }

    public boolean hasAge() {
        return age > 0;
    }

    public boolean hasAddress() {
        return !address.equals(null);
    }
    public void setAge(int age) {
        // проверяем задан ли возраст
        if (hasAge()) {
            throw new IllegalStateException("Возраст уже задан!");
        }

        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Возраст указан некорректно!");
        } else {
            this.age = age;
        }
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
    }

    public void happyBirthday() {
        age++;
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname).setAddress(this.address).setAge(age);
    }


    @Override
    public String toString() {
        return "[" + name + ", " + surname + ", " + age + ", " + address + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        return result;
    }
}

