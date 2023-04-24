package game;

public enum Face {
    NINE(1),
    TEN(2),
    JACK(3),
    QUEEN(4),
    KING(5),
    ACE(6);

    final private int value;

    private Face(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
