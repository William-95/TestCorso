package esercizi;

public class DistributoreBenzina {
    private double deposito=0;        //benzina disponibile nel distributore
    private double euroPerLitro;    //prezzo benzina

    public DistributoreBenzina(double unPrezzoPerLitro){}


    public static void main(String[] args) {
DistributoreBenzina dist= new DistributoreBenzina(14);
        System.out.println(dist.deposito);
    }
}
