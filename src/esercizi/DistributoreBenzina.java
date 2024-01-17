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
    }
    public void vendi(double euro, Car unaAutomobile){              //da finire
        double benzinaAcquistata= euroPerLitro/euro;
        System.out.println("Aquistati l: "+benzinaAcquistata);
    }
    public void aggiorna(double unPrezzoPerLitro){   //aggiorna il prezzp della benzina
        this.euroPerLitro=unPrezzoPerLitro;
        System.out.println("il prezzo della benzina è di $ "+unPrezzoPerLitro+"/l.");
    }
    public void getDeposito(){
        System.out.println("Deposito: "+deposito);
    }
    public static void main(String[] args) {
        DistributoreBenzina dist= new DistributoreBenzina(1.89);
        dist.rifornisci(100);
        dist.getDeposito();
        dist.aggiorna(10);
        System.out.println("Prezzo carburante: "+dist.euroPerLitro);
        dist.vendi(10,new Car(14));
    }
}
