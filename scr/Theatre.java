public class Theatre {
    static void main(String[] args) {
    Director directorOne = new Director("Анна", "Каренина", Person.Gender.FEMALE, 5);
    Director directorTwo = new Director("Сергей", "Петрович", Person.Gender.MALE, 6);

    Actor actorOne = new Actor("Иван", "Иванов", Person.Gender.MALE, 190);
    Actor actorTwo = new Actor("Василиса", "Царева", Person.Gender.FEMALE, 178);
    Actor actorThree = new Actor("Алина", "Лапина", Person.Gender.FEMALE, 169);

    Show show = new Show("Чайковский", 90, directorOne);
    Opera opera = new Opera("Пушкин", 110, directorTwo, "А", "Б", 5);
    Ballet ballet = new Ballet("Автор1", 70, directorOne, "Г", "Каренин", "Иван");

    show.addActor(actorOne);
    show.addActor(actorThree);

    opera.addActor(actorOne);
    opera.addActor(actorTwo);

    ballet.addActor(actorThree);
    ballet.addActor(actorTwo);

    System.out.println("Спектакль");
    show.printActors();

    System.out.println("Опера");
    opera.printActors();

    System.out.println("Баллет");
    ballet.printActors();

        System.out.println("Замена актера " + actorOne.surname + " на - " + actorTwo.surname);
        show.replaceActor("Иванов", actorTwo);

        System.out.println("Замена актера " + actorTwo.surname + " на - " + actorOne.surname);
        ballet.replaceActor("Иванов", actorTwo);

        System.out.println("Замена на не существующего актера!");
        show.replaceActor("Сириус", actorTwo);

        opera.libretto();
        ballet.libretto();
    }
}
