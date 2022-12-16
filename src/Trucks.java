public class Trucks extends Transport implements Competing{
    public Trucks(String brand, String model, double fuelPercentage,BigCar lift ){
        super(brand, model, fuelPercentage);
        this.lift = lift;
    }

    private  BigCar lift;

    public void setLift(BigCar lift) {
        this.lift = lift;
    }

    public BigCar getLift() {
        return lift;
    }

    public void  print(){
        System.out.println(super.toString()+" "+ getLift());
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


