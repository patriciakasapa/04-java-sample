package io.turtabl;

public class Book {

    @Override
    public String toString() {
        return "Book{" +
                "category=" + category +
                ", BookTitle='" + BookTitle + '\'' +
                ", state=" + state +
                '}';
    }

    public Book(Category category, String bookTitle, BookState state) {
        this.category = category;
        BookTitle = bookTitle;
        this.state = state;
    }

    private Category category;


    private String BookTitle;

    private BookState state;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }

    public BookState getState() {
        return state;
    }

    public void setState(BookState state) {
        this.state = state;
    }
}
