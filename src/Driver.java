public class Driver extends  Transport  {
    private String fullName;
    private  String drivingLicense;
    private String experience;

    public Driver(String brand, String model, double fuelPercentage, String fullName, String drivingLicense, String experience) {
        super(brand, model, fuelPercentage);
        this.fullName = fullName;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
    }

    public void go(){
        System.out.println("Водитель "+fullName+" Управляет автомобилем "+ getBrand()+" и будет учавствовать в заезде");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
