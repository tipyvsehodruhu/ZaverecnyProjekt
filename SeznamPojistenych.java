package cz.itnetwork.zaverecnyprojekt;
import java.util.*;
import java.util.stream.Collectors;

public class SeznamPojistenych<jmeno,prijmeni,vek, telCislo> {
private final Scanner sc = new Scanner(System.in, "Windows-1250");

public ArrayList<Zaznam> seznam = new ArrayList<>(); 


public void pridejPojistence(String jmeno, String prijmeni, int vek, int telCislo){
    seznam.add(new Zaznam( jmeno, prijmeni,vek, telCislo));
}

public void hledaniPojisteneho(String hledaneJmeno, String hledanePrijmeni){
    System.out.println("");
    seznam.stream()
                 .filter(p -> p.getJmeno().equals(hledaneJmeno) && p.getPrijmeni().equals(hledanePrijmeni))
                .collect(Collectors.toList())
                 .forEach(System.out::println);
}

public void smazZaznam(int index){
    seznam.remove(index);
}
 


public void vypsatSeznam(){
    for(Zaznam zaznamy: seznam){
        System.out.println(seznam.indexOf(zaznamy) + " " +zaznamy);
    }
}



/*public void vypsatSeznam() {
        seznam.stream()
                .forEach(p -> {
            int index = seznam.indexOf(p);
            System.out.println("(" + index + ") " + p);
        });
                }
*/

}
