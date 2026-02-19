public class Director extends Person {

    private final int numberOfShows;

    public Director(String name, String surname, GENDER gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }
}
