public class Book {
    String nameBook;
    int yearBook;
    Author authorBook;

    public Book(String nameBook, int yearBook, Author authorBook) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.authorBook = authorBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthorBook() {
        return this.authorBook;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
