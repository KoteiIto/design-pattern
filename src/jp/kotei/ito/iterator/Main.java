package jp.kotei.ito.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("デザインパターン入門"));
        bookShelf.appendBook(new Book("オライリー"));
        bookShelf.appendBook(new Book("実践Javascript"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
