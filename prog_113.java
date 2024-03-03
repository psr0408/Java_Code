import java.util.ArrayList;

class Book {
    public String name;
    public String author;
    public String issued_to;
    public String issue_on;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return name;
    }

}

class MyLibrary {
    ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        System.out.println("The book has been added to the library");

        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to) {
        System.out.println("The book has been issued from the library to " + issued_to);

        this.books.remove(book);
    }

    public void returnBook(Book b) {
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}

public class prog_113 {
    public static void main(String[] args) {
        // Exercise 7 solution
        // Library Management System
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 =  new Book("Algorithm", "CLRS");
        bk.add(b1);
        bk.add(new Book("Algorithm2", "CLRS2"));
        bk.add(new Book("Algorithm3", "CLRS3"));
        bk.add(new Book("Algorithm4", "CLRS4"));
        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("algo4", "MyAuthor"));
        System.out.println(l.books);
        l.issueBook(b1, "Prashant");
        System.out.println(l.books);

    }
}
