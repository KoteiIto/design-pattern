package jp.kotei.ito.abstractfactory;

class ListTray extends Tray {
    ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        tray.forEach(item -> {
            buffer.append(item.makeHTML());
        });
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
