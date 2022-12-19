public enum Body {
    SEDAN("Седан"),HATHBACK("Хэчбек"),KUPE("Купе"),STATION_WAGON("Универсал"),TRUCK("Внедорожник"),CROSSOVER("Кроссовер"),PIKAP("Пикап");

    private String body;

    Body(){

    }
    Body(String body){
        this.body = body;
    }

    @Override
    public String toString() {
        return this.body;
    }
}
