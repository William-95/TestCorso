package esercizi;
import java.util.Scanner;

public class Rettangolo{
    final int base;
    final int altezza;

    public Rettangolo(int base,int altezza){
        this.base=base;
        this.altezza=altezza;
    }

    public void creaArea(){
        System.out.println("L'area del rettangolo è "+base*altezza);
    }
    
    public void utenteCrea(){
        Scanner input= new Scanner(System.in);
        System.out.println("Definisci altezza rettangolo:");
        int altezza= input.nextInt();
        System.out.println("Definisci base rettangolo:");
        int base= input.nextInt();
        System.out.println("L'area del rettangolo da te dato è: "+base*altezza);

    }


    public static void main(String[] args) {
        Rettangolo rettangolo=new Rettangolo(5,6);
        rettangolo.creaArea();
        rettangolo.utenteCrea();
    }
}
