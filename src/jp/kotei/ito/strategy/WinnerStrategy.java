package jp.kotei.ito.strategy;

import java.util.Random;

class WinnerStrategy implements Strategy {
    private Random random;
    private boolean isWin = false;
    private Hand prevHand;

    WinnerStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!isWin) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean isWin) {
        this.isWin = isWin;
    }
}
