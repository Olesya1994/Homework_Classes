public class Book {
   // private Author authorName ;
    //private Author authorSecondName ;
    private int year;
    private String name;

    public Book(Author bulgakov, int year, String name) {

        this.authorSecondName = Author.getName()
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

    //public void setAuthor(String author) {
        //this.author = author;
    //}

    public void setYear(int year) {
        this.year = year;
    }
}

