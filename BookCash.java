/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshelf.bookstore;

import static java.awt.Color.pink;
import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tanka
 */
public class BookCash {
    private static Map <int, Book > bookMap = new HashMap < int, Book > ();
    
    public static Book getBook(int id) {
        Book toBeClonedBook = bookMap.get(id);
        return (Book) toBeClonedBook.clone();
    }

    public static void loadCache() {
        FantasyBook fb1 = new FantasyBook();
        bookMap.put(1, fb1);

        ComicBook cb1 = new ComicBook();
        cb1.setColor("pink");
        bookMap.put(1, cb1);


    }
}
