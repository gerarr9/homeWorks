public class Bus extends Transport implements  Competing{
    public Bus(String brand, String model, double fuelPercentage) {
        super(brand, model, fuelPercentage);
    }

    public void  print(){
        System.out.println(super.toString());
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
