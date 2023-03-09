import java.util.Objects;

public class Author {
    private String authorName;
    private String authorLastName;
    public Author(String authorName, String authorLastName ) {
        this.authorName = authorName;
        this.authorLastName = authorLastName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setAuthorLastName(String author) {
        this.authorLastName = authorLastName;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public String getAuthorLastName() {
        return this.authorLastName;
    }
    public String toString() {
        return "Автор -" + authorName + " " + authorLastName ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorLastName, author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorLastName);
    }
}
