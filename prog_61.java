class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;

    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added");
    }

    void showAvailableBooks() {
        System.out.println("Available books are : ");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        // for (String b : this.books) {
            for (int i = 0; i < this.books.length; i++) {

                if (this.books[i].equals(book)) {
                    System.out.println("The book has been issued");
                    this.books[i] = null;
                    return;
                }
                
            // }
            System.out.println("This book does not exit");
        }
        

        }
        void returnBook(String books){
            addBook(books);
    }
}
public class prog_61 {
    public static void main(String[] args) {
        // Exercise no 4 solution
        // You have to implement a library using java class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Arrary to store the issued books
        Library centralLibrary = new Library();
        centralLibrary.addBook("think and grow rich");
        centralLibrary.addBook("Algorithm");
        centralLibrary.addBook("C++");
        
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}
