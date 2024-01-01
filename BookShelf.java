/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshelf;

import java.awt.print.Book;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author tanka
 */
public class BookShelf {
    private static BookShelf instance;
    private List<Book> storage;
    
    private BookShelf(){
    this.storage=new LinkedList<Book>();
    }
    
    public static BookShelf getInstance(){
        if(instance==null){
            instance=new BookShelf();
        }
        return instance;
    }
       
    public void printContent(){
        System.out.println("On my shelf:");
        for(Book b:storage){
            b.printContent();
        }
    }

    void addBook(bookshelf.bookstore.Book b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
