package lab_2.problem1.Bmodels;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Director/Author: " + author + ", Year: " + publicationYear;
    }
}
