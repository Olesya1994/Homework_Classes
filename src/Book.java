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
}

