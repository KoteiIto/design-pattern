package jp.kotei.ito.prototype;


public class MessageBox extends Product {
    private char decochar;

    MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.length();
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.print("\n");
        System.out.printf("%s %s %s\n", decochar, s, decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.print("\n");
    }
}
