package hu.petrik.helloworld;
public abstract class Szamla extends BankiSzolgaltatasok{

    protected int aktualisEgyenleg;
    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void Befizet(int ossz){
        ossz+=aktualisEgyenleg;
    }
    public abstract boolean Kivesz(int ossz);

}
