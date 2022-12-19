public class EzCar  extends Transport implements Competing{
    public EzCar(String brand, String model, double fuelPercentage,Body body) {
        super(brand, model, fuelPercentage);
        this.body = body;

    }
    private Body body;

    public void setBody(Body body) {
        this.body = body;
    }
    public String getBody(){
        return body.toString();
    }

    public void  print(){
        System.out.println(super.toString() +" "+ getBody());
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

    @Override
    public boolean servise() {
        return false;
    }

    @Override
    public void fix() {

    }
}
