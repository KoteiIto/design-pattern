package jp.kotei.ito.abstractfactory;

public class Main {
    public static void main(String args[]) {
        Factory factory = new ListFactory();
        Link asahi = factory.createLink("朝日", "http://www.asahi.com");
        Tray tray = factory.createTray("新聞");
        tray.add(asahi);
        Page page = factory.createPage("LinkPage", "Kotei");
        page.add(tray);
        page.output();
    }
}
