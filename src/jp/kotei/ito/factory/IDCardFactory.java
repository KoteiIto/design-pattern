package jp.kotei.ito.factory;

import java.util.HashMap;

public class IDCardFactory extends Factory{
    private HashMap<String, Product> idCardMap;

    IDCardFactory() {
        idCardMap = new HashMap<>();
    }

    @Override
    protected Product createProduct(String owner) {
        if (idCardMap.get(owner) != null) {
            return idCardMap.get(owner);
        } else {
            Product idCard = new IDCard(owner);
            registerProduct(idCard);
            return idCard;
        }
    }

    @Override
    protected void registerProduct(Product product) {
        idCardMap.put(product.getOwner(), product);
    }
}
