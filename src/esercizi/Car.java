package esercizi;

public class Car {
    private int serbatoio=0;
    private double resa;

    public Car(int serbatoio,double resa){
        this.serbatoio=serbatoio;
        this.resa=resa;
    }
    public int drive(double km){
        double consumi= km/resa;
        double rimanenza=serbatoio-consumi;
        System.out.println("sono rimasti "+rimanenza+" l.");
        return serbatoio-=consumi;

    }
    public void getGas(){ //visualizza carburante
        System.out.println("Al momento sono disponibili "+serbatoio+" l.");
    }

    public void addGas(int gas){   //fai carburante
        serbatoio +=gas;
        System.out.println("Sono stati riforniti "+gas+" l.");
    }
    public static void main(String[] args) {
        Car car1=new Car(0,14);
        car1.addGas(15);
        car1.drive(150);
        car1.getGas();
    }
}
