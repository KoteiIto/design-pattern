package jp.kotei.ito.abstractfactory;

abstract class Item {
    String caption;

    Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
