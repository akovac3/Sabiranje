package ba.unsa.etf.rpr;
import java.util.Scanner;   //koristene biblioteke

public class Sabiranje {

    public static void main(String[] args) {
        int jabuke, kruske, voce;
        Scanner ulaz=new Scanner(System.in); //ulazni objekat
        System.out.println("Unesite broj jabuka: ");
        jabuke=ulaz.nextInt();
        System.out.println("Unesite broj krušaka: ");
        kruske=ulaz.nextInt();
        voce=jabuke+kruske;
        System.out.println("Ukupno voća: "+ voce);
    }
}
