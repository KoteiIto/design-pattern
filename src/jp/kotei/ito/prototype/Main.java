package jp.kotei.ito.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Manager manager = new Manager();
        manager.register("upen", new UnderlinePen('~'));
        manager.register("mbox", new MessageBox('*'));

        List<Product> productList = new ArrayList<>();
        productList.add(manager.create("upen"));
        productList.add(manager.create("mbox"));
        productList.forEach(product -> {
            product.use("Design Pattern");
        });
    }
}
