public enum  StronySwiata {
    NORTH ("północ", 0),
    EAST ("wschód", 1),
    SOUTH ("południe", 2),
    WEST ("zchód", 3),
    UNDEFINED("nieznany",4);

    private final String nazwaPolska;
    private int index;

    private StronySwiata(String nazwaPolska, int index) {
        this.nazwaPolska=nazwaPolska;
        this.index=index;
    }

    private StronySwiata(String nazwaPolska) {
        this.nazwaPolska=nazwaPolska;
    }

    public String getNazwaPolska() {
        return nazwaPolska;
    }

    public int getIndex() {
        return index;
    }

    public String convert (int index) {

        switch (index) {
            case 0: return "NORTH";
            case 1: return "EAST";
            case 2: return "SOUTH";
            case 3: return "WEST";
            default: return "UNDEFINED";

        }
    }
}
