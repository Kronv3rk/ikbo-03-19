package ru;

import ru.Book;

public class BookTest {

    public static void main(String[]args){

        Book book = new Book("Steve","The Story",1935);
        System.out.println(book.toString());
    }

}
