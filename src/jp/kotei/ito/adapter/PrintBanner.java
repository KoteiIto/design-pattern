package jp.kotei.ito.adapter;

class PrintBanner implements Print {
    private Banner banner;

    PrintBanner(String text) {
        this.banner = new Banner(text);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
