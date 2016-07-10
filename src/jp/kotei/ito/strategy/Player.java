package jp.kotei.ito.strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount = 0;
    private int losecount = 0;
    private int gamecount = 0;

    Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    void even() {
        gamecount++;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        buffer.append(name);
        buffer.append(":");
        buffer.append(gamecount);
        buffer.append(" games, ");
        buffer.append(wincount);
        buffer.append(" win, ");
        buffer.append(losecount);
        buffer.append(" lose]");
        return buffer.toString();
    }
}
