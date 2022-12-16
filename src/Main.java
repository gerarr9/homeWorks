import java.security.Permission;

public class Main {
    public static void main(String[] args) {
        EzCar lada = new EzCar("Lada","D-31",89,Body.TRUCK);
        lada.print();
        System.out.println("Пит стоп - "+ lada.getPitStop());
        System.out.println("Лучшее время "+lada.getBestTime() +" секунд");
        System.out.println("Максимальная скорость "+lada.getMaxSpeed() +" км/c");
        EzCar slada = new EzCar("sLada","D-21",39,Body.TRUCK);
        slada.setBody(Body.HATHBACK);
        slada.print();
        EzCar dlada = new EzCar("dLada","D-11",19,Body.TRUCK);
        dlada.print();
        Trucks gen = new Trucks("Mraza","T-11",12,BigCar.N1);
        gen.print();
        System.out.println("Пит стоп - "+ gen.getPitStop());
        System.out.println("Лучшее время "+gen.getBestTime() +" минут");
        System.out.println("Максимальная скорость "+gen.getMaxSpeed() +" км/c");
        Trucks gen1 = new Trucks("Mraza1","T-12",33,BigCar.N2);
        gen1.print();
        Trucks gen2 = new Trucks("Mraza2","T-13",45,BigCar.N3);
        gen2.print();
        Bus gogo = new Bus("Sraza2","T-13",41,BusPlace.SMALL);
        gogo.print();
        System.out.println("Пит стоп - "+ gogo.getPitStop());
        System.out.println("Лучшее время "+gogo.getBestTime() +" минут");
        System.out.println("Максимальная скорость "+gogo.getMaxSpeed() +" км/c");
        Bus gogo1 = new Bus("Sraza1","T-13",11,BusPlace.LARGE);
        gogo.print();
        Bus gogo2 = new Bus("Sraza3","T-13",31,BusPlace.LARGE);
        gogo.print();
       Driver oleg = new Driver("Lada","D-21",39,"Oleg Oleg Oleg","B","3 года");
       oleg.go();





    }
}