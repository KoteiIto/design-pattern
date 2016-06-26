package jp.kotei.ito.iterator;

class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}
