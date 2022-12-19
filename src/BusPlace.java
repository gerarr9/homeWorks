public enum BusPlace {
    VERY_SMALL(0,10),SMALL(10,25),MID(40,50),LARGE(60,80),VERY_LARGE(100,120);

    private int minPlase;
    private int maxPlase;

    BusPlace(int minPlase, int maxPlase) {
        this.minPlase = minPlase;
        this.maxPlase = maxPlase;
    }
}
