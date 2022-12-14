public class EzCar  extends Transport implements Competing{




    public EzCar(String brand, String model, double fuelPercentage) {
        super(brand, model, fuelPercentage);
    }



    public void  print(){
        System.out.println(super.toString());
   }

    @Override
    public String getPitStop() {
        return "Нет";
    }

    @Override
    public double getBestTime() {

        return Math.random()*50;
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
