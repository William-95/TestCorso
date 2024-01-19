package esercizioEreditarietà;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Alimentari extends Prodotti{

    private LocalDate dataScadenza;


    public Alimentari(String descrizione, double prezzo,String codiceBarre,String dataScadenza) {
        super(descrizione, prezzo, codiceBarre);
        this.dataScadenza= LocalDate.parse(dataScadenza, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public LocalDate getDataScadenza(){return dataScadenza;}

    @Override           //finire
    public void applicaSconto() {
        LocalDate giorniPrima = dataScadenza.minusDays(10);
        Period period = Period.between(dataScadenza, giorniPrima);
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        System.out.println(giorniPrima);
//        LocalDate dataCorrente=LocalDate.now();
//        if((dataCorrente-dataScadenza)<=10){
//            double extraSconto=(super.getPrezzo()/100)*20;
//            System.out.println("sconto:"+extraSconto);
//            super.getPrezzo() - extraSconto
//        }
//         super.applicaSconto();
    }

    public static void main(String[] args) {
        Alimentari pasta=new Alimentari("pacco di pasta buona",1.20,"6491526157894","2024-02-15");
       LocalDate leggiData= pasta.getDataScadenza();
        double prezzo= pasta.getPrezzo();
        String desc= pasta.getDescrizione();
        System.out.println(leggiData);
        System.out.println(prezzo);
        System.out.println(desc);
        pasta.applicaSconto();
    }

}
