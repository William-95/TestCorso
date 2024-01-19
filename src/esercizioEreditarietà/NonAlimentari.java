package esercizioEreditarietà;

import java.util.Objects;

public class NonAlimentari extends Prodotti{

    private String materialePrincipale;

    public NonAlimentari(String descrizione, double prezzo,String codiceBarre,String materialePrincipale) {
        super(descrizione, prezzo, codiceBarre);
        this.materialePrincipale=materialePrincipale;
    }

    public String getMaterialePrincipale(){return materialePrincipale;}

    @Override
    public void applicaSconto() {
        if (materialePrincipale=="plastica" || materialePrincipale=="vetro"|| materialePrincipale=="carta") {
            double extraSconto=(super.getPrezzo()/100)*10;
            System.out.println("sconto:"+extraSconto);
            double nuovoPrezzo = super.getPrezzo() - extraSconto;
            super.setPrezzo(nuovoPrezzo);
        }
         super.getPrezzo();
    }

    public static void main(String[] args) {
        NonAlimentari palla=new NonAlimentari("rotonda, gialla e rossa",5,"0000000151515","plastica");
        palla.applicaSconto();
        String materiale= palla.getMaterialePrincipale();
        double prezzo= palla.getPrezzo();
        String desc= palla.getDescrizione();
        System.out.println(materiale);
        System.out.println(prezzo);
        System.out.println(desc);


    }
}
