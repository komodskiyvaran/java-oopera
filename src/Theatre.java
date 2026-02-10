import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        String libOpera = "Акт I.\n" +
                "Сцена в венецианском дворце. Дездемона в ожидании Отелло поёт арию о тревоге и любви.\n" +
                "Хор придворных обсуждает слухи о войне.\n" +
                "Яго, в монологе, раскрывает план мест";
        String libBallet = "Картина 1: Зал зеркал.\n" +
                "Алиса, любуясь отражением, замечает,\n" +
                "что тень движется самостоятельно.\n" +
                "Танец-диалог с Тенью, полный любопытства и страха.";

        Actor act1 = new Actor("Юрий", "Смекалов", GENDER.MALE, 184);
        Actor act2 = new Actor("Диана", "Вишнёва", GENDER.FEMALE, 157);
        Actor act3 = new Actor("Елизавета", "Кравец", GENDER.FEMALE, 119);

        ArrayList<Actor> actorsShow = new ArrayList<>();
        ArrayList<Actor> actorsOpera = new ArrayList<>();
        ArrayList<Actor> actorsBallet = new ArrayList<>();

        Director director1 = new Director("Джеймс", "Кэмерон", GENDER.MALE, 15);
        Director director2 = new Director("Алексей", "Балабанов", GENDER.MALE, 23);

        String musicAuthor = "Пётр Ильич Чайковский";
        String choreographer = "Майя Михайловна Плисецкая";

        Show show = new Show("Короли танцпола", 60, director2, actorsShow);
        Opera opera = new Opera("Последнее письмо Дездемоны", 150, director1, actorsOpera, musicAuthor, libOpera, 12);
        Ballet ballet = new Ballet("Тени зазеркалья", 120, director2, actorsBallet, musicAuthor, libBallet, choreographer);

        show.addActors(act1);
        show.addActors(act2);

        opera.addActors(act3);
        opera.addActors(act1);

        ballet.addActors(act2);
        ballet.addActors(act3);

        printActorsShow(show);
        printActorsShow(opera);
        printActorsShow(ballet);

        show.replaceActor(act1, act3);
        printActorsShow(show);

        opera.replaceActor(new Actor("Валерий", "Михеев", GENDER.MALE, 192), act1);
        printActorsShow(opera);

        System.out.println(opera.getLibrettoText() + "\n");
        System.out.println(ballet.getLibrettoText());
    }

    public static void printActorsShow(Show show) {
        System.out.println("Представление — " + show.getTitle());
        show.printActors();
        System.out.println();
    }
}

