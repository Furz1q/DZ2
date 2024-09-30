import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", yearBook=" + yearBook +
                ", authorBook=" + (authorBook != null ? authorBook.toString() : "Автор неизвестный.") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(authorBook, book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearBook, authorBook);
    }
}
