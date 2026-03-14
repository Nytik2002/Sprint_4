public class Director extends Actor {
    int numberOfShows;
    public Director(String name, String surname, int height, int numberOfShows) {
        super(name, surname, height);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return name + ", " + surname; // просто возвращаем поля класса
    }
}
