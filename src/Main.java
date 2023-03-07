public class Main {
        public static void main (String[]args){
            Author author1 = new Author("Михаил", "Булгаков");
            Author author2 = new Author("Лев", "Толстой");
            Book book1 = new Book(author1, 1928, "Мастер и маргарита");
            Book book2 = new Book(author2, 1878, "Анна Каренина");
            Book book3 = new Book(author2, 1878, "Анна Каренина");
            //System.out.println("book1.getName() = " + book1.getName());
            //System.out.println("book2.getName() = " + book2.getName());
            //System.out.println("author1.getName() = " + author1.getAuthorName());
            //System.out.println("author2.getLastName() = " + author2.getAuthorLastName());
            //book2.setYear(1872);
            System.out.println("book2.getYear() = " + book2.getYear());
            System.out.println("book1 = " + book1);
            System.out.println(book2.hashCode());
            System.out.println("book2.equals(book3) = " + book2.equals(book3));
        }
}
