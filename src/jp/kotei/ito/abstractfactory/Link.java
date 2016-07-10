package jp.kotei.ito.abstractfactory;

abstract class Link extends Item {
    String url;

    Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
