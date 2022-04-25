package lab2.emt.model;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    private Author author;
    private Integer Copies;
    private Category category;


    public Book(String name, Category category, Author author, Integer Copies) {

        this.name = name;
        this.category = category;
        this.author = author;
        this.Copies = Copies;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getCopies() {
        return Copies;
    }

    public void setCopies(Integer Copies) {
        this.Copies = Copies;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}