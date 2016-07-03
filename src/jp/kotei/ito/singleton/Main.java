package jp.kotei.ito.singleton;

public class Main {
    public static void main(String args[]) {
        System.out.println("start main");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1 == instance2) {
            System.out.println("same instance");
        } else {
            System.out.println("different instance");
        }
    }
}
