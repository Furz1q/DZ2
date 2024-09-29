public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book book = new Book("Детство", 1852, author);
        author = book.getAuthorBook();
        Author author1 = new Author("Александр", "Пушкин");
        Book book2 = new Book("Дубровски", 1841, author1);
        author1 = book2.getAuthorBook();
        book.setYearBook(1984);
        System.out.println("book.getYearBook() = " + book.getYearBook());
        System.out.println("Название книги - "
                + book.getNameBook() + ", выпущена - "
                + book.getYearBook() + ", написал книгу - "
                + book.getAuthorBook() );
    }
}