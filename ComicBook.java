/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshelf.bookstore;

/**
 *
 * @author tanka
 */
public class ComicBook extends Book{
    private boolean color;
    ComicBook(){
        this.genre= "Comic book";
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void printContent() {
        System.out.println(this.getISBN()+": color print ["+this.color+"], "+this.getGenre()+","+this.getPages()+"pp.");
    }
    
}
