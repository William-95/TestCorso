package esercizioEreditarietà;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alimentari extends Prodotti{

    private LocalDate dataScadenza;


    public Alimentari(String descrizione, double prezzo,String codiceBarre,String dataScadenza) {
        super(descrizione, prezzo, codiceBarre);
        this.dataScadenza= LocalDate.parse(dataScadenza, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public LocalDate getDataScadenza(){return dataScadenza;}

    @Override
    public void applicaSconto() {
        LocalDate giorniPrima = dataScadenza.minusDays(10);
        LocalDate dataCorrente= LocalDate.now();

        if (dataCorrente.isAfter(giorniPrima)) {
            double extraSconto=(super.getPrezzo()/100)*20;
            System.out.println("sconto prodotti Alimentari: "+extraSconto);
            super.setPrezzo(super.getPrezzo()-extraSconto);
        }
        super.getPrezzo();
    }

    public static void main(String[] args) {
        Alimentari pasta=new Alimentari("pacco di pasta buona",1.20,"6491526157894","2024-01-30");
       LocalDate leggiData= pasta.getDataScadenza();

        String desc= pasta.getDescrizione();
        System.out.println(leggiData);
        pasta.applicaSconto();
        double prezzo= pasta.getPrezzo();
        System.out.println(prezzo);
        System.out.println(desc);


    }

}
