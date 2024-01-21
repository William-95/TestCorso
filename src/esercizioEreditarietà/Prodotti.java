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
//        return super.getClass().getName()+" codice a barre: "+ this.codiceBarre;
    return "codice prodotto: "+codiceBarre+
            "\n descrizione: "+descrizione+
            "\n prezzo: "+prezzo;
    }


}
