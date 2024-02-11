public class _051_Book_Library {
    public static void main(String[] args) {
        Library newLibrary = new Library(10);
        newLibrary.addBook("Discrete Math");
        newLibrary.addBook("Diff Eqn");
        newLibrary.addBook("EE Lab");
        newLibrary.addBook("OOP in Java");
        System.out.println("------------");
        newLibrary.showAllBooks();
        System.out.println("------------");
        newLibrary.issueBook("Discrete Math");
        newLibrary.issueBook("OOP");
        System.out.println("------------");
        newLibrary.returnBook("Discrete Math");
        newLibrary.returnBook("EE Lab");
        newLibrary.returnBook("OOP");
        System.out.println("------------");
        newLibrary.showAllBooks();
    }
}

class Library {
    String books[], issuedBooks[];
    int noOfBooks, noOfIssuedBooks;

    Library() {
        books = new String[100];
        issuedBooks = new String[100];
        noOfBooks = 0;
        noOfIssuedBooks = 0;
    }

    Library(int n) {
        books = new String[n];
        issuedBooks = new String[n];
        noOfBooks = 0;
        noOfIssuedBooks = 0;
    }

    void addBook(String book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                noOfBooks++;
                System.out.println("<---Book added!--->");
                break;
            }
        }
    }

    void issueBook(String book) {
        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                books[i] = null;
                noOfBooks--;
                found = true;
                System.out.println("<---Book issued!--->");
                break;
            }
        }
        if (found) {
            for (int i = 0; i < issuedBooks.length; i++) {
                if (issuedBooks[i] == null) {
                    issuedBooks[i] = book;
                    noOfIssuedBooks++;
                    break;
                }
            }
        } else {
            System.out.println("Sorry! " + book + " is not available!");
        }
    }

    void returnBook(String book) {
        boolean found = false;
        for (int i = 0; i < issuedBooks.length; i++) {
            if (issuedBooks[i] == book) {
                issuedBooks[i] = null;
                noOfIssuedBooks--;
                found = true;
                System.out.println("<---Book Returned!--->");
                break;
            }
        }
        if (found) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                    noOfBooks++;
                    break;
                }
            }
        } else {
            System.out.println(book + " is not issued from here!");
        }
    }

    void showAllBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            } else {
                System.out.println((i + 1) + ": " + books[i]);
            }
        }
    }
}