import java.util.Objects;

public class Book {
      private int year;
    private String name;
    private Author author;

    public Book(Author author, int year, String name) {
        this.author = author;
        this.year = year;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public void setName(String name) {
        this.name = name;
    }

       public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Автор -" + author.getAuthorName() + " " + author.getAuthorLastName() + ". Название книги - " + name + ". Год издания " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name, author);
    }
}

