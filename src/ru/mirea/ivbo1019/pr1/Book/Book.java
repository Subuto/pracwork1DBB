package ru.mirea.ivbo1019.pr1.Book;
import java.lang.*;
public class Book {
    private String name;
    private int page;

    public Book(String n,int a){
        name=n;
        page=a;
    }
    public Book(String n){
        name =n;
        page=0;
    }
    public Book(){
        name="";
        page=0;
    }
    public void setPage(int page){
        this.page=page;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(String name){
        return name;
    }
    public int getPage(){
        return page;
    }

    public void bookMark(){
        System.out.println(name + " have " + page + " pages ");
    }
}
