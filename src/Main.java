import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
     metodiEs metodiEs = new metodiEs();

        int risultato = metodiEs.moltiplica(5,3);

    System.out.println("il risultato è " + risultato);

     System.out.println( metodiEs.concatena(5, " è un nr"));


     Scanner scanner = new Scanner(System.in);

     System.out.println("inserisci una prima stringa");

    String string1= scanner.nextLine();

    System.out.println("inserisci una seconda stringa");
    String string2= scanner.nextLine();

    System.out.println("inserisci una terza stringa");
    String string3= scanner.nextLine();



 Esercizio2 esercizio2 =  new Esercizio2();

 String concatString = esercizio2.scan(string1, string2, string3);
 System.out.println(concatString);


 Esercizio3 esercizio3 =  new Esercizio3();


        double perimetro = esercizio3.perimetroRettangolo(5,3);

        System.out.println("il perimetro è " + perimetro);

        int pariDispari= esercizio3.pariDispari(5);
        System.out.println(pariDispari);

        double area = esercizio3.perimetroTriangolo(5,3, 7);
        System.out.println("l'area del triangolo è: " + area);

}


}