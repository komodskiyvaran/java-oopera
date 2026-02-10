
import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActors(Actor newActor) {
        if (!isActorListed(newActor)) {
            listOfActors.add(newActor);
        }
    }

    public void replaceActor(Actor oldActor, Actor newActor) {
        if (!isActorListed(oldActor) && isActorListed(newActor)) {
            System.out.println("Замена невозможна!");
        } else {
            listOfActors.remove(oldActor);
            listOfActors.add(newActor);
        }
    }

    private boolean isActorListed(Actor actor) {
        boolean isFound = false;
        for (Actor act : listOfActors) {
            if (act.equals(actor)) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}