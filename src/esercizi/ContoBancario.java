package esercizi;

public class ContoBancario {
    private int conto;

    public ContoBancario(){}

    public void versaDenaro(int denaro){
        conto += denaro;
        System.out.println("Sono stati versati $"+denaro);

    }
    public void riscuotiDenaro(int denaro){
        conto -= denaro;
        System.out.println("Sono stati prelevati $"+denaro);
    }

    public void getConto(){
        System.out.println("sul tuo conto sono disponibili $"+conto);
    }
    public void contoInteressi(){
        int balance=10;
        int i = (conto / 100) * balance;
        int i1 = conto + i;
        System.out.println("sul tuo conto sono disponibili $"+i1);
    }

    public static void main(String[] args) {
       ContoBancario harrysChecking = new ContoBancario();
       harrysChecking.versaDenaro(1000);
       harrysChecking.riscuotiDenaro(500);
       harrysChecking.riscuotiDenaro(400);
       harrysChecking.getConto();

       ContoBancario momsSaving= new ContoBancario();
        momsSaving.versaDenaro(1000);
        momsSaving.contoInteressi();
    }
}
