import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected GENDER gender;

    public Person(String name, String surname, GENDER gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (name != null ? name.hashCode() : 0);
        hash = 31 * hash + (surname!= null ? surname.hashCode() : 0);
        return hash;
    }
}
