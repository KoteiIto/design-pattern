package jp.kotei.ito.abstractfactory;

import java.util.ArrayList;

abstract class Tray extends Item{
    ArrayList<Item> tray = new ArrayList<>();

    Tray(String caption) {
        super(caption);
    }

    void add(Item item) {
        tray.add(item);
    }
}
