package esercizi;

public class Dipendente {
    private String nome;
    private double stipendio;

    public Dipendente(){}
    public Dipendente(String nome,double stipendio){
        this.nome=nome;
        this.stipendio=stipendio;
    }

    public String getNome(){
        System.out.println(nome);
        return nome;
    }
    public void setNome(String nuovoNome){
        nome=nuovoNome;
    }
    public double getStipendio(){
        System.out.println(stipendio);
        return stipendio;
    }
    public void setStipendio(double nuovoStipendio){
        stipendio=nuovoStipendio;
    }
     public void aumento(double percentuale){
        double aumento=(stipendio/100)*percentuale;
        stipendio +=aumento;

     }
    public static void main(String[] args) {
        Dipendente dip1=new Dipendente("ugo",1200);
        dip1.getNome();
        dip1.setStipendio(1000);
        dip1.getStipendio();
        dip1.aumento(10);
        dip1.getStipendio();
    }
}
