import java.util.Objects;

public class Actor extends Person {

    private final int height;

    public Actor(String name, String surname, GENDER gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + height + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + height;
        return hash;
    }
}
