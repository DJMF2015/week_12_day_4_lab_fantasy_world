package players;

public enum SpellType {

    FIRE(10),
    LIGHTNING(9),
    ICE(8);

    private final int value;


    SpellType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
