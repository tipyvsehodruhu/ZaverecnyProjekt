package cz.itnetwork.zaverecnyprojekt;
import java.util.*;

public class Program {
    private ArrayList<Zaznam> seznam = new ArrayList<>(); 
private final Scanner sc = new Scanner(System.in, "Windows-1250");
    Prikazy prikazy = new Prikazy();
    //...........úvod ,spustí se jen při zapnutí aplikace
public void uvod(){
    System.out.println("..........................................................................................");
    System.out.println("Databáze pojištěnců");
}

    //...............hlavní rozhraní
public void vypisInterakce()
{
    int volba = 0;
    while(volba != 5)
    {
        System.out.println("..........................................................................................");
        System.out.println("(1) Vypsat seznam pojištěných");
        System.out.println("(2) Vyhledat pojištěného");
        System.out.println("(3) Přidat nového pojištěnce");
        System.out.println("(4) Smazat pojištěnce");
        System.out.println("(5) Ukonči seznam pojištěných");
        System.out.println("..........................................................................................");
 
         volba = Integer.parseInt(sc.nextLine());
        switch (volba)
        {
        case 1 -> prikazy.vypisZaznamy();
        case 2 -> prikazy.vyhledejPojisteneho();
        case 3 -> prikazy.pridejZaznam();
        case 4 -> prikazy.smazZaznam();
        case 5 -> System.out.println();
        default -> System.out.println("Neplatná volba! Zadej znovu:\n..................................................................................");
        }
        
    }
    
}

//........... spustí ukončení programu
public void konecInterakce() throws InterruptedException{
    System.out.println("Ukončuji program.......................");
    Thread.sleep(800);
    System.out.println("Konec");
}   
}
