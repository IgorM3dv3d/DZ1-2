package Ucheba.DZ_29_30;

public class OOP {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstName("Анджей");
        author1.setLastName("Сапковский");

        Author author2 = new Author();
        author2.setFirstName("Тоору");
        author2.setLastName("Фудзисава");

        Book book1 = new Book();
        book1.setAuthor(author1);
        book1.setTitle("Крещение огнём");
        book1.setYear(1996);

        Book book2 = new Book();
        book2.setAuthor(author2);
        book2.setTitle("Great Teacher Onizuka");
        book2.setYear(1997);

        System.out.println(author1.getInfo());
        System.out.println(author2.getInfo());

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());


    }
}
