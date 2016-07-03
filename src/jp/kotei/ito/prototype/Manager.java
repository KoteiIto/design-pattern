package jp.kotei.ito.prototype;

import java.util.HashMap;

class Manager {
    private HashMap<String, Product> showcase;

    Manager() {
        this.showcase = new HashMap<>();
    }

    void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    Product create(String name) {
        Product proto = showcase.get(name);
        return proto.createClone();
    }
}
