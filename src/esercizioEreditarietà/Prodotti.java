package esercizioEreditarietà;


public class Prodotti {
    private byte codiceBarre;
    private String descrizione;
    private double prezzo;
    public Prodotti(String descrizione, double prezzo){
        this.codiceBarre++;
        this.descrizione=descrizione;
        this.prezzo=prezzo;
    }

    public byte getCodiceBarre() {return codiceBarre;}

    public String getDescrizione() {return descrizione;}

    public double getPrezzo() {return prezzo;}

    public double applicaSconto(){
        double sconto=(prezzo/100)*5;
        return prezzo=prezzo-sconto;
    }

    public static void main(String[] args) {
        Prodotti prod=new Prodotti("ciambelle fresche",1.50);
        byte id1=prod.getCodiceBarre();

        System.out.println(id1);
        Prodotti prod1=new Prodotti("cappuccino",3);
//        byte id2=prod1.getCodiceBarre();
//        System.out.println(id2);

        prod1.applicaSconto();
        double prezzo= prod1.getPrezzo();
        System.out.println(prezzo);
    }
}
