package isbndb.api.client;

import isbndb.api.rest.BookLookup;

/**
 * Created by Dewes on 07/07/2016.
 *
 * Respeita minha Key, crie a sua em
 * http://isbndb.com/account/dev
 *
 */
public class Main {

    private static String ACESS_KEY = "5AZJWNDY";

    public static void main(String[] args) {
        Book book;
        BookLookup bl = new BookLookup();
        bl.setAccessKey(ACESS_KEY);
        book = bl.byIsbn("9788599296158");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthors());
        System.out.println(book.getIsbn13());
        System.out.println(book.getIsbn());
    }
}
