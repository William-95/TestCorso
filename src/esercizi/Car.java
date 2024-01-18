package esercizi;

public class Car {
    private double serbatoio=0;
    private double resa;

    public Car(double resa){
        this.resa=resa;
    }
    public double drive(double km){
        double consumi= km/resa;
        double rimanenza=serbatoio-consumi;
        System.out.println("Al veicolo sono rimasti "+rimanenza+" l.");
        return serbatoio-=consumi;

    }
    public void getGas(){ //visualizza carburante
        System.out.println("Al momento il veicolo dispone di "+serbatoio+" l.");
    }

    public void addGas(double gas){   //fai carburante
        serbatoio +=gas;
        System.out.println("Sono stati riforniti al veicolo "+gas+" l.");
    }
    public static void main(String[] args) {
        Car car1=new Car(14);
        car1.addGas(15);
        car1.drive(150);
        car1.getGas();
    }
}
