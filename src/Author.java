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
    public void setAuthor(String author) {
        this.authorLastName = authorLastName;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public String getAuthorLastName() {
        return this.authorLastName;
    }
}
