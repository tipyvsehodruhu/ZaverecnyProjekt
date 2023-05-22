package cz.itnetwork.zaverecnyprojekt;


public class Zaznam {
// public ArrayList<Zaznam> seznam = new ArrayList<>(); 
private String jmeno;
private String prijmeni;
private int telCislo;
private int vek;

public Zaznam(String jmeno, String prijmeni, int vek, int telCislo){
    this.telCislo = telCislo;
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.vek = vek;
}

public String getJmeno(){return jmeno;}
public String getPrijmeni(){return prijmeni;}
public int getTelCislo(){return telCislo;}
public int getVek(){return vek;}

@Override
public String toString(){
    return  getJmeno()+ " "+getPrijmeni()+ " "+getVek()+" "+getTelCislo();
}

}
