package jp.kotei.ito.strategy;

interface Strategy {
    abstract Hand nextHand();
    abstract void study(boolean isWin);
}
