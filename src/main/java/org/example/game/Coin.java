package org.example.game;

import java.util.List;
import java.util.Random;

public class Coin {
    public enum HEADS_OR_TAILS {heads, tails};
    private String side;

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip() {
        setSide(String.valueOf(HEADS_OR_TAILS.values()[new Random().nextInt(HEADS_OR_TAILS.values().length)]));
    }
}
