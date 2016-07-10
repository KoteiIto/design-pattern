package jp.kotei.ito.strategy;

class Hand {
    public static final int HANDVALUE_GUU = 0;
    static final int HANDVALUE_CHOKI = 1;
    static final int HANDVALUE_PAA = 2;
    static final Hand[] hands = {new Hand(HANDVALUE_GUU), new Hand(HANDVALUE_CHOKI), new Hand(HANDVALUE_PAA)};

    private static final String[] names = {"グー", "チョキ", "パー"};
    private int handvalue;

    Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) {
        return hands[handvalue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == hand.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return names[handvalue];
    }
}
