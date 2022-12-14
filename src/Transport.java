public  class Transport implements Competing {
    private   String brand;
    private  String model;
    private  double fuelPercentage;



    public Transport(String brand, String model, double fuelPercentage) {
        this.brand = brand;
        this.model = model;
        this.fuelPercentage = fuelPercentage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelPercentage(double fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }
    public void start(){
        System.out.println("Начал движение");
    }
    public  void  end(){
        System.out.println("Закончил движение");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelPercentage=" + fuelPercentage +
                '}';
    }

    @Override
    public String getPitStop() {
        return null;
    }

    @Override
    public double getBestTime() {
        return 0;
    }

    @Override
    public double getMaxSpeed() {
        return 0;
    }

    @Override
    public String getDrivingLicense() {
        return null;
    }


}



