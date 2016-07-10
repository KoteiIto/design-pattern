package jp.kotei.ito.bridge;

class Display {
    private DisplayImpl displayImpl;

    Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    void open() {
        displayImpl.rawOpen();
    }

    void print() {
        displayImpl.rawPrint();
    }

    void close() {
        displayImpl.rawClose();
    }

    final void display() {
        open();
        print();
        close();
    }
}
