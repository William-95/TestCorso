package esercizioEreditarietà;


public class Prodotti {
    private String codiceBarre;
    private String descrizione;
    private double prezzo;
    public Prodotti(String descrizione, double prezzo,String codiceBarre){

        this.codiceBarre=codiceBarre;

        this.descrizione=descrizione;
        this.prezzo=prezzo;

    }
    //getter
    public String getCodiceBarre() {return codiceBarre;}
    public String getDescrizione() {return descrizione;}
    public double getPrezzo() {return prezzo;}

    //setter
    public void setCodiceBarre(String codiceBarre) {this.codiceBarre = codiceBarre;}
    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}
    public void setPrezzo(double prezzo) {this.prezzo = prezzo;}


    public void applicaSconto(){
        double sconto=(prezzo/100)*5;
        this.prezzo=prezzo-sconto;
    }

    //toString and equals
    public boolean equals(Object o) {
        if(o instanceof Prodotti) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.getClass().getName()+" codice a barre: "+ this.codiceBarre;
    }

    public static void main(String[] args) {
        Prodotti prod=new Prodotti("ciambelle fresche",1.50,"1234667891011");
//        String id1=prod.getCodiceBarre();
//
//        System.out.println(id1);
//        Prodotti prod1=new Prodotti("cappuccino",3,"1234667891014");
//        String id2=prod1.getCodiceBarre();
//        System.out.println(id2);
//
//        prod1.applicaSconto();
//        double prezzo= prod1.getPrezzo();
//        System.out.println(prezzo);
        System.out.println(prod.toString());
    }
}
