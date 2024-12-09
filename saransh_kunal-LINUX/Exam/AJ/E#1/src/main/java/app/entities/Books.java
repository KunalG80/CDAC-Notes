package app.entities;

import java.lang.annotation.Inherited;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Books{
    
    @Id
    private int id;
    private varchar name;
    private int isbn;
    private double price;
    private varchar author;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public varchar getName() {
        return name;
    }
    public void setName(varchar name) {
        this.name = name;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public varchar getAuthor() {
        return author;
    }
    public void setAuthor(varchar author) {
        this.author = author;
    }

}