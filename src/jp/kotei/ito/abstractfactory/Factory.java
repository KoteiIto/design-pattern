package jp.kotei.ito.abstractfactory;

abstract class Factory {
    static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch(ClassNotFoundException e) {
            System.out.printf("class name [$s] not found.\n", classname);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    abstract Link createLink(String caption, String url);
    abstract Tray createTray(String caption);
    abstract Page createPage(String title, String author);
}
