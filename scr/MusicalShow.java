public class MusicalShow {
    String musicAuthor; //автор музыки
    String librettoText; //текст либретто

    public MusicalShow(String musicAuthor, String librettoText) {
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void Libretto() {
        System.out.println(librettoText);
    }


}
