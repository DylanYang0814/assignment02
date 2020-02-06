package assignment02;

public class Library {

    public static void main(String[] args) {
        Book[] library = new Book[3];
        library[0] = new Book("Divergent", 200);
        library[1] = new Book("Insurgent", 250);
        library[2] = new Book("Mockingbird", 150);

        for (int i = 0; i < 3; i++) {
            System.out.println(library[i].getTitle());
        }

        for (Book eachBook : library) {
            System.out.println(eachBook.getNumPages());
        }
        System.out.println("Expected: 600");
        System.out.println(numPagesInLibrary(library));
        System.out.println("Expected: 250");
        System.out.println(mostPages(library));
    }

    public static int numPagesInLibrary(Book[] books) {
        int total = 0;
        if (books != null) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null) {
                    total += books[i].getNumPages();
                }
            }
        }
        return total;
    }

    public static int mostPages(Book[] books) {
        int longest = 0;
        if (books != null) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null) {
                    if (books[i].getNumPages() > longest) {
                        longest = books[i].getNumPages();
                    }
                }
            }
        }
        return longest;
    }
}
