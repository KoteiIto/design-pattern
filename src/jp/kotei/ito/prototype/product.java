package jp.kotei.ito.prototype;

abstract class Product implements Cloneable {
    abstract void use(String s);

    Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
