public class Sponsor {
    private final  String name;
    private int  amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public  void toSponsor(){
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n",name,amount);
    }
}
