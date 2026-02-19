
import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final ArrayList<Actor> listOfActors;

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
        if (listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст!");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(actor);
            }
        }
    }

    public void addActors(Actor newActor) {
        if (!isActorListed(newActor)) {
            listOfActors.add(newActor);
        } else {
            System.out.println("Актер уже добавлен в постановку!");
        }
    }

    public void replaceActor(String oldSurname, Actor newActor) {
        ArrayList<Actor> actorsToReplace = new ArrayList<>();
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(oldSurname)) {
                actorsToReplace.add(actor);
            }
        }

        if (actorsToReplace.isEmpty()) {
            System.out.println("Актер с фамилией " + oldSurname + " не найден!");
        } else if (actorsToReplace.size() > 1) {
            System.out.println("Найдено несколько актеров с фамилией " + oldSurname +
                    ". Замена не выполнена, уточните данные.");
        } else {
            Actor oldActor = actorsToReplace.getFirst();
            int index = listOfActors.indexOf(oldActor);
            listOfActors.set(index, newActor);
            System.out.println("Актер " + oldActor.getName() + " " + oldActor.getSurname() +
                    " заменен на " + newActor.getName() + " " + newActor.getSurname());
        }
    }

    public void printDirectorInfo() {
        if (director != null) {
            System.out.println("Режиссер: " + director);
        } else {
            System.out.println("Информация о режиссере отсутствует");
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