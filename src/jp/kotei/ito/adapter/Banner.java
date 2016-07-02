package jp.kotei.ito.adapter;

class Banner {
    private String text;

    Banner(String text) {
        this.text = text;
    }

    void showWithParen() {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        builder.append(text);
        builder.append(")");
        System.out.println(builder.toString());
    }

    void showWithAster() {
        StringBuilder builder = new StringBuilder();
        builder.append("*");
        builder.append(text);
        builder.append("*");
        System.out.println(builder.toString());
    }
}
