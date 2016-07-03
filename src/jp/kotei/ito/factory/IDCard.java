package jp.kotei.ito.factory;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    void use() {
        System.out.printf("%sのIDCardを使用します\n", owner);
    }

    @Override
    public String getOwner() {
        return owner;
    }
}
