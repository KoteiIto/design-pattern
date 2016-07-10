package jp.kotei.ito.strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue;
    private int currentHandValue;

    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
    };

    ProbStrategy(int seed) {
        random = new Random(seed);
        prevHandValue = 0;
        currentHandValue = 0;
    }

    private int getSum(int handvalue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i];
        }
        return sum;
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int nextHandValue = 0;
        if (bet < history[currentHandValue][0]) {
            nextHandValue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            nextHandValue = 1;
        } else {
            nextHandValue = 2;
        }

        prevHandValue = currentHandValue;
        currentHandValue = nextHandValue;
        return Hand.getHand(nextHandValue);
    }

    @Override
    public void study(boolean isWin) {
        if (isWin) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
