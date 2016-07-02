package jp.kotei.ito.template;

public class Main {
    public static void main(String args[]) {
        AbstractDisplay charDisplay = new CharDisplay('X');
        charDisplay.display();
    }
}
