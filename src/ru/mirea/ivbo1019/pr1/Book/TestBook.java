package ru.mirea.ivbo1019.pr1.Book;

public class TestBook {
    public static void main (String[]args){
        Book b1 = new Book("War and peace",1300);
        Book b2 = new Book("Karamazov brothers");
        Book b3 = new Book();
        b2.setPage(567);
        b3.setName("The crime and the punishment");
        b3.setPage(372);
        System.out.println(b1);
        b1.bookMark();
        b2.bookMark();
        b3.bookMark();

    }
}
