package jp.kotei.ito.prototype;

class UnderlinePen extends Product {
    char ulchar;

    UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.length();
        System.out.printf("\"%s\"\n", s);
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.print("\n");
    }
}
