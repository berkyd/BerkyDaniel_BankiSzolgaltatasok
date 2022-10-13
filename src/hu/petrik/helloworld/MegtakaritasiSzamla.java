package hu.petrik.helloworld;

public abstract class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    public double alapKamat;
    public MegtakaritasiSzamla(Tulajdonos tulajdonos){
        super(tulajdonos);
    }
    public int getKamat() { return (int) kamat; }
}
