package designPrinciples;

import java.util.ArrayList;
import java.util.List;

public class Composition {
    public static void main(String[] args) {
        Book designPatterns = new Book("Intro to Design Patterns", "Billy Ray");
        Book algorithmThinking = new Book("Algorithm Thinking", "Elvis Presley");
        Book javaBrains = new Book("Java Brains: A guide to Enterprise Solution", "Angie Jones");
        Book springBoot = new Book("Spring Boot Basics", "Edwin Schwandiger");

        List<Book> bookList = new ArrayList<>();
        bookList.add(designPatterns);
        bookList.add(algorithmThinking);
        bookList.add(javaBrains);
        bookList.add(springBoot);

        Library worldBankLibrary = new Library(bookList);
        worldBankLibrary.displayBooks();

    }
}

class Book{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}


class Library{
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void displayBooks(){
        for(Book book : getBooks()){
            System.out.println("Title: " + book.getTitle() + "\n\r"
                    + "Author: " + book.getAuthor() + "\n\r");
        }
    }
}
