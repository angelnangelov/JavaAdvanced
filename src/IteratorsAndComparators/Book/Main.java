package IteratorsAndComparators.Book;

import java.util.*;
import java.util.regex.Pattern;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        Book bookThree = new Book("The Documents in the Case", 2002);


        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        Collections.sort(books);
        

        LibraryIterator library = new LibraryIterator();
        for (Book book : library) {
            out.println(book.toString());
        }

        List<Integer> number = new ArrayList<>();

        number.add(13);
        number.add(12);
        number.add(131);

        ListIterator<Integer> integerIterator = number.listIterator();
        while (integerIterator.hasNext()) {
            out.println(integerIterator.next());
        }
    }

}

