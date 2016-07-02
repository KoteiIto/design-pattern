package jp.kotei.ito.template;

public class CharDisplay extends AbstractDisplay {
    char ch;

    CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(ch);
    }

    @Override
    protected void close() {
        System.out.print(">>");
        System.out.print("\n");
    }
}
