package ambienteTest;

import esercizi.Car;
import esercizi.DistributoreBenzina;

public class Viaggio {
    public static void main(String[] args) {
        Car car1=new Car(15);
        Car car2=new Car(15);
        Car car3=new Car(15);
        DistributoreBenzina dist= new DistributoreBenzina(1.89);

        dist.rifornisci(50);

        dist.vendi(20,car1);
        dist.vendi(10,car2);
        dist.vendi(30,car3);

        car1.getGas();
        car2.getGas();
        car3.getGas();

        car1.drive(100);
        car2.drive(50);
        car3.drive(150);

        car1.getGas();
        car2.getGas();
        car3.getGas();

        dist.getDeposito();

        dist.rifornisci(50);


        dist.vendi(20,car1);
        dist.vendi(20,car2);
        dist.vendi(20,car3);

        car1.getGas();
        car2.getGas();
        car3.getGas();

        car1.drive(100);
        car2.drive(50);
        car3.drive(10);

        car1.getGas();
        car2.getGas();
        car3.getGas();

        dist.getDeposito();

    }
}
