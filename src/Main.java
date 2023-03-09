public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Михаил", "Булгаков");
        Author author2 = new Author("Лев", "Толстой");
        Book book1 = new Book(author1, 1928, "Мастер и маргарита");
        Book book2 = new Book(author2, 1878, "Анна Каренина");
        Book book3 = new Book(author2, 1878, "Анна Каренина");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println(book2.hashCode());
        System.out.println("book2.equals(book3) = " + book2.equals(book3));
    }
}
