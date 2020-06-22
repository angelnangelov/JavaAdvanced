package IteratorsAndComparators.Book;

import java.util.*;

public class Book implements Comparable<Book>{


    public static class CompareBooksByYearsAscending implements Comparator<Book> {

        @Override
        public  int compare(Book first, Book second) {
            return Integer.compare(first.getYear(),second.getYear());
        }
    }

    private String title;
    private int year;
    private List<String> authors;

   public Book(String title, int year,String ... authors){
       setTitle(title);
       setYear(year);
       setAuthors(authors);
    }

    private void setAuthors(String... authors){
       this.authors = Arrays.asList(authors);
       }



    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book " +
                "title " + title + '\'' +
                ", year " + year +
                ", authors " + authors ;
    }

    @Override
    public int compareTo(Book o) {
        int result =  Integer.compare(this.year,o.year);
        return  result != 0 ? result : Integer.compare(this.year,o.year);

    }
}
