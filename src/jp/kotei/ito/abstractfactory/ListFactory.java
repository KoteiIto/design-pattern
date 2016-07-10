package jp.kotei.ito.abstractfactory;

class ListFactory extends Factory{
    @Override
    Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
