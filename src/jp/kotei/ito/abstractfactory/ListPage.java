package jp.kotei.ito.abstractfactory;

class ListPage extends Page{
    ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        content.forEach(item -> {
            buffer.append(item.makeHTML());
        });
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
