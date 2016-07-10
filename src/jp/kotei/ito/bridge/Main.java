package jp.kotei.ito.bridge;

public class Main {
    public static void main(String args[]) {
        CountDisplay display = new CountDisplay(new StringDisplayImpl("Hello World"));
        display.multiDisplay(10);
    }
}
