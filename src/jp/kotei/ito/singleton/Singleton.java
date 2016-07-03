package jp.kotei.ito.singleton;

class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("created sinbleton instance");
    }

    static Singleton getInstance() {
        return instance;
    }
}
