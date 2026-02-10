import java.util.Objects;

public class Actor extends Person {

    private final int height;

    public Actor(String name, String surname, GENDER gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " [" + getHeight() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;
        return Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname()) &&
                (getHeight() == actor.getHeight());
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (getName() != null ? getName().hashCode() : 0);
        hash = 31 * hash + (getSurname() != null ? getSurname().hashCode() : 0);
        hash = 31 * hash + getHeight();
        return hash;
    }
}
