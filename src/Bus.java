public class Bus extends Transport implements  Competing{
    private BusPlace plase;
    public Bus(String brand, String model, double fuelPercentage,BusPlace plase) {
        super(brand, model, fuelPercentage);
        this.plase = plase;
    }

    public BusPlace getPlase() {
        return plase;
    }

    public void setPlase(BusPlace plase) {
        this.plase = plase;
    }

    public void  print(){
        System.out.println(super.toString()+" "+getPlase());
    }
    @Override
    public String getPitStop() {
        return "Был";
    }

    @Override
    public double getBestTime() {

        return Math.random()*3000;
    }

    @Override
    public double getMaxSpeed() {
        return Math.random()*100;
    }
}
