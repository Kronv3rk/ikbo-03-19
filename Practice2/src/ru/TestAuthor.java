package ru;

import ru.Author;

public class TestAuthor {
    public static void main(String[]args){
        Author author = new Author("Steve", "asdsa", 'm');
        System.out.println(author.toString());
    }
}
