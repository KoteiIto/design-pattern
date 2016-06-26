package jp.kotei.ito.iterator;

import java.util.ArrayList;
import java.util.List;

class BookShelf implements Aggregate {
    private List<Book> books;

    BookShelf() {
        books = new ArrayList<>();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    Book getBookAt(int index) {
        return books.get(index);
    }

    void appendBook(Book book) {
        books.add(book);
    }

    int getLength() {
        return books.size();
    }
}
