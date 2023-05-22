package cz.itnetwork.zaverecnyprojekt;
import java.util.*;


public class Prikazy {
private Scanner sc = new Scanner(System.in, "Windows-1250");
    
public SeznamPojistenych pojisteni = new SeznamPojistenych();
    public ArrayList<Zaznam> seznam = new ArrayList<>(); 


    
    //vyhledá jednotlivého pojištěného
public void vyhledejPojisteneho(){
        System.out.print("Zadej hledáné jméno:");
        String hledaneJmeno = sc.nextLine();
        System.out.print("Zadej hledané přijmení:");
        String hledanePrijmeni = sc.nextLine();
        System.out.print("..........................................................................................");
        pojisteni.hledaniPojisteneho(hledaneJmeno, hledanePrijmeni);
        System.out.println("..........................................................................................");
    }
    
//přidá záznam nového pojištěnce
public void pridejZaznam(){
    
    System.out.print("Zadej jméno uchazeče:");
    String jmeno = sc.nextLine();                                                                                            //zadá jméno
    while(!(jmeno.matches("^[a-zA-Zá-žÁ-Ž]+$"))){                                                         // kontrola, jestli jsou písmena z abecedy
        System.out.println("Zadal jsi jméno ve špatném tvaru! Zadej ho znovu:");
        jmeno = sc.nextLine();
    }
         
    System.out.print("\nZadej přijmení uchazeče:");                                                      
    String prijmeni = sc.nextLine();                                                                                        //zadá přijmení
    while(!(prijmeni.matches("^[a-zA-Zá-žÁ-Ž]+$"))){                                                      // kontrola, jestli jsou písmena z abecedy
        System.out.println("Zadal jsi přijmení ve špatném tvaru! Zadej ho znovu:");
        prijmeni = sc.nextLine();
    }
    System.out.print("\nZadej věk uchazeče:");
    String slovoVek = sc.nextLine();                                                                                           //zadá věk
    while(slovoVek.matches("^[a-zA-Zá-žÁ-Ž]+$")){
        System.out.println("Zadal jsi věk špatně! Zadej ho znovu:");
        slovoVek = sc.nextLine();
    }
    int vek = Integer.parseInt(slovoVek);
    while(!((vek >0) && (vek <300))){                                                                                         //kontrola, jestli zadal číslo
        System.out.println("Zadal jsi špatný věk! Zadej ho znovu:");
        vek = Integer.parseInt(sc.nextLine()); 
    }
    System.out.print("\nZadej telefonní číslo uchazeče:");
    int telCislo = Integer.parseInt(sc.nextLine());
    
    pojisteni.pridejPojistence(jmeno, prijmeni, vek, telCislo);
    System.out.println(".................................Pojištěnec byl uložen..................................................");
}

// vypíše seznam všech pojištěných
public void vypisZaznamy(){
         pojisteni.vypsatSeznam();
         
}

//smaže záznam na daném indexu
public void smazZaznam()
{
    System.out.println("............................................................................");
    vypisZaznamy();
    System.out.println("............................................................................");
    System.out.print("Zadej index pojištěnce pro smazání záznamu:");
    int index = Integer.parseInt(sc.nextLine());
       
        
         pojisteni.smazZaznam(index);
      //  System.out.println("Vydařilo se");
        
        
    }   
}
