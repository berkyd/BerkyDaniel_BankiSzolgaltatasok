package hu.petrik.helloworld;

public class Kartya extends BankiSzolgaltatasok{

    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla=szamla;
        this.kartyaSzam=kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }
    public boolean vasarlas(int osszeg){
        if (szamla.getAktualisEgyenleg()>=0){
            szamla.aktualisEgyenleg-=osszeg;
            return true;
        }
        else {
            return false;
        }
    }
}
