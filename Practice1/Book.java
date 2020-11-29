package ru.mirea.prac1;

public class Book {
    public static class bookprac{
        private  String author;
        private  int year;
        bookprac(String author,int year)
        {
            this.author = author;
            this.year = year;
        }
        public  void ToString()
        {
            System.out.println(author);
            System.out.println(year);
        }
    }

    public static void main (String[]args)
    {
        Book.bookprac book;
        book = new Book.bookprac("Unknown", 1969);
        book.ToString();
    }
}
