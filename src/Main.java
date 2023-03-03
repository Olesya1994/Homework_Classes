public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Author Bulgakov = new Author("Михаил", "Булгаков");
        Book MasterAndMargarita = new Book(Bulgakov, 1928, "Мастер и маргарита");
        System.out.println("MasterAndMargarita.getName() = " + MasterAndMargarita.getName());
    }
}
