package jp.kotei.ito.builder;

public class Main {
    public static void main(String args[]) {
        Director director = new Director(new HTMLBuilder());
        director.constract();
    }
}
