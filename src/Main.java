import java.security.Permission;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EzCar lada = new EzCar("Lada","D-31",89,Body.TRUCK);
        Driver oleg = new Driver("Lada","D-21",39,"Oleg Oleg Oleg","B","3 года");
        Sponsor loco = new Sponsor("Локо", 1_500_000);
        Mechanic<EzCar> sanya = new Mechanic("Саньков Саня Санявич","ООО.Саня.Интертеймонт");
        lada.addDriver(oleg);
        lada.addMehanic(sanya);
        lada.addSponsor(loco);
        lada.print();
        System.out.println("Пит стоп - "+ lada.getPitStop());
        System.out.println("Лучшее время "+lada.getBestTime() +" секунд");
        System.out.println("Максимальная скорость "+lada.getMaxSpeed() +" км/c");
        EzCar slada = new EzCar("sLada","D-21",39,Body.TRUCK);
        slada.setBody(Body.HATHBACK);
        Driver oleg1 = new Driver("Lada","D-21",39,"Oleg Oleg Oleg","B","3 года");
        Sponsor loco1 = new Sponsor("Локо", 1_500_000);
        Mechanic sanya1 = new Mechanic("Саньков Саня Санявич","ООО.Саня.Интертеймонт");
        lada.addDriver(oleg1);
        lada.addMehanic(sanya1);
        lada.addSponsor(loco1);
        lada.print();
        slada.print();
        EzCar dlada = new EzCar("dLada","D-11",19,Body.TRUCK);
        Driver oleg2 = new Driver("Lada","D-21",39,"Oleg Oleg Oleg","B","3 года");
        Sponsor loco2 = new Sponsor("Локо", 1_500_000);
        Mechanic sanya2 = new Mechanic("Саньков Саня Санявич","ООО.Саня.Интертеймонт");
        lada.addDriver(oleg2);
        lada.addMehanic(sanya2);
        lada.addSponsor(loco2);
        lada.print();
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

        List<Transport> transports = List.of(lada,slada,dlada);
        for (Transport transport: transports){
            printInfo(transport);
        }


        }
    private static  void printInfo(Transport transport){
        System.out.println("Информация по автомобилю "+transport.getBrand()+ " "+transport.getModel());
        System.out.println("Водители ");
        for (Mechanic mechanic : transport.getMechanics()){
            System.out.println(mechanic.getFullName());
        }
        System.out.println("Спосоры ");
        for (Sponsor sponsor : transport.getSponsors()){
            System.out.println( sponsor.getName());
        }
    }
}