package esercizi;

public class Cellulare {
    private double carica;  //euro disponibili
    private int numeroChiamate;  //chiamate effettuate

    public Cellulare(double unaCarica){
        carica+=unaCarica;
    }

    public void ricarica(double unaRicarica){
        carica+= unaRicarica;
        System.out.println("sono stati caricati $"+unaRicarica);
    }

    public void chiama(double minutiDurata){
        double costoChiamata= minutiDurata*0.20;
        carica -= costoChiamata;
        numeroChiamate ++;
        System.out.println("La chiamata è durata "+minutiDurata+" minuti.");
    }
    public double numero404(){
        System.out.println("Saldo disponibile di $"+carica);
        return carica;
    }

    public int getNumeroChiamate(){
        System.out.println("Hai effettuato "+numeroChiamate+" chiamate.");
        return numeroChiamate;
    }
    public void azzeraChiamate(){
        numeroChiamate=0;
        System.out.println("Hai effettuato "+numeroChiamate+" chiamate.");
    }

    public static void main(String[] args) {
Cellulare cell=new Cellulare(10.00);
cell.ricarica(10);
cell.chiama(5);
cell.chiama(18);
cell.numero404();
cell.getNumeroChiamate();
cell.azzeraChiamate();
cell.getNumeroChiamate();
    }
}
