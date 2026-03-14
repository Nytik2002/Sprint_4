public class Opera extends MusicalShow {
    int choirSize; //количество человек в хоре

    public Opera(String musicAuthor, String librettoText, int choirSize) {
        super(musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
