package ru.mirea.ivbo1019.pr1.ball;
import java.lang.*;
import ru.mirea.ivbo1019.pr1.Dog.Dog;

public class ballTest {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 2, 10);
        Ball b2 = new Ball("Blue", 7);
        Ball b3 = new Ball("Green");
        b2.setCoord(5);
        b3.setRadius(2);
        b3.setCoord(4);
        System.out.println(b1);
        b1.pnut();
        b2.pnut();
        b3.pnut();
    }
}
