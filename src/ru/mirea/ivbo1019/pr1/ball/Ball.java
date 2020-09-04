package ru.mirea.ivbo1019.pr1.ball;
import java.lang.*;
public class Ball {
    private String color;
    private int radius;
    private int coord;
    public Ball(String c, int r, int co) {
        color = c;
        radius = r;
        coord = co;
    }
    public Ball(String c, int r) {
        color = c;
        radius = r;
        coord = 0;
    }
    public Ball(String c) {
        color = c;
        radius = 1;
        coord = 0;
    }
    public Ball() {
        color = "White";
        radius = 1;
        coord = 0;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setCoord(int coord) {
        this.coord = coord;
    }
    public String getColor(String color) {
        return color;
    }
    public int getRadius() {
        return radius;
    }
    public int getCoord() {
        return coord;
    }
    public String toString() {
        return "color is " +this.color+", radius - "+this.radius+" and coord is "+this.coord;
    }
    public void pnut() {
        coord = coord + 5;
        System.out.println(color+" pnuli, new coord is "+(coord+5));
    }
}
