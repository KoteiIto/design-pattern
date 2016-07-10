package jp.kotei.ito.abstractfactory;

import java.util.ArrayList;

abstract class Page {
    String title;
    String author;
    ArrayList<Item> content = new ArrayList<>();

    Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void add(Item item) {
        content.add(item);
    }

    void output() {
        System.out.println(this.makeHTML());
    }

    abstract String makeHTML();
}
