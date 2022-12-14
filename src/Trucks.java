public class Trucks extends Transport implements Competing{
    public Trucks(String brand, String model, double fuelPercentage) {
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

        return Math.random()*200;
    }

    @Override
    public double getMaxSpeed() {
        return Math.random()*100;
    }

    @Override
    public String getDrivingLicense() {
        return "Имеет лицензию класса B";
    }


}


