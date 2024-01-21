package esercizioEreditarietà;


public class ListaSpesa{
private double scontrino;
    public double getScontrino() {
        System.out.println(scontrino);
        return scontrino;
    }
    public void setScontrino(double scontrino) {this.scontrino = scontrino;}

    public void contoCassa(Prodotti []carrello, boolean tesseraFedeltà){
        double somma=0;
        if(tesseraFedeltà==true) {
           for (int i = 0; i < carrello.length; i++) {
               carrello[i].applicaSconto();
               somma=somma+carrello[i].getPrezzo();
           }
            setScontrino(somma);
       }else{
            for (int i = 0; i < carrello.length; i++) {
                somma=somma+carrello[i].getPrezzo();
            }
            setScontrino(somma);
        }
    }

    public static void main(String[] args) {
        NonAlimentari palla=new NonAlimentari("palla bella",5,"1234567891234","plastica");
        NonAlimentari finestra=new NonAlimentari("infisso salone",20,"12340007891234","vetro");
        Alimentari bistecca=new Alimentari("carne di manzo",10,"0987654321918","2024-01-30");
        Alimentari pollo= new Alimentari("pollo al forno",3.5,"4567834561484","2024-01-30");

        Prodotti[]lista={palla,finestra,bistecca,pollo};

        ListaSpesa spesa=new ListaSpesa();
        spesa.contoCassa(lista,true);
        spesa.getScontrino();
    }
}
