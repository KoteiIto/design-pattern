package jp.kotei.ito.factory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Factory idCardFactory = new IDCardFactory();
        List<Product> list = new ArrayList<>();
        list.add(idCardFactory.create("ito"));
        list.add(idCardFactory.create("sato"));
        list.add(idCardFactory.create("goto"));
        list.forEach(product -> product.use());
    }
}
