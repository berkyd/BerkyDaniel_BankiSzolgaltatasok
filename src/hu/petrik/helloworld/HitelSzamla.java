package hu.petrik.helloworld;

public abstract class HitelSzamla extends Szamla{
    private int hitelKeret;
    public HitelSzamla(Tulajdonos tulajdonos,int hitelKeret){
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }
}
