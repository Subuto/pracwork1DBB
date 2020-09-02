
package Book;
import java.lang.*;

public class TestBook {
    public static void main (String[]args){
        Book d1 = new Book ("Зелённая миля",496);
        Book d2 = new Book("Война и мир",1300);
        Book d3 = new Book ("Гарри Поттер и филосовский камень",399);
        d1.bookMark();
        d2.bookMark();
        d3.bookMark();

    }
}
