package esercizi;

public class DistributoreBenzina {
    private double deposito=0;        //benzina disponibile nel distributore
    private double euroPerLitro;    //prezzo benzina

    public DistributoreBenzina(double unPrezzoPerLitro){
        this.euroPerLitro=unPrezzoPerLitro;
    }
    public void rifornisci(double unaQuantita){
        deposito+=unaQuantita;
        System.out.println("Sono stati riforniti "+unaQuantita+" l.");
        getDeposito();
    }
    public void vendi(double euro, Car unaAutomobile){              //vendi carburante ad un auto
        double benzinaAcquistata= (euro / euroPerLitro);
        System.out.println("Aquistati l: "+benzinaAcquistata);
        unaAutomobile.addGas(benzinaAcquistata);
        deposito -=benzinaAcquistata;
        getDeposito();
    }
    public void aggiorna(double unPrezzoPerLitro){   //aggiorna il prezzp della benzina
        this.euroPerLitro=unPrezzoPerLitro;
        System.out.println("il prezzo della benzina è di $ "+unPrezzoPerLitro+"/l.");
    }
    public void getDeposito(){
        System.out.println("Deposito: "+deposito);
    }
    public static void main(String[] args) {
        DistributoreBenzina dist= new DistributoreBenzina(2);
        Car car1=new Car(14);
        dist.rifornisci(50);
        dist.aggiorna(1.5);
        System.out.println("Prezzo carburante: "+dist.euroPerLitro);
        dist.vendi(16,car1);
        car1.getGas();
    }
}
