public enum BigCar {                             //Грузоподъенные
    N1(0f,3.5f),N2(3.5f,12f),N3(12f,20f);

    private Float minLift;
    private Float maxLift;
    BigCar(){

    }
    BigCar(Float minLift, Float maxLift){
        this.minLift = minLift;
        this.maxLift = maxLift;
    }

    @Override
    public String toString() {
        return "От" + minLift +" "+
                "До " + maxLift ;
    }
}
