public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    //Constructor
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // GEtter
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }

    //Setter
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    // implementasi method abstract (extend BangunDatar)
    @Override
    public double hitungKeliling() {
        return (2 * panjang) + (2 * lebar);
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public String toString() {
        return "\t( PERSEGI PANAJNG )\n" + 
        "Panjang : " + panjang + ", Lebar : " + lebar + "\n" +
        "Keliling : " + hitungKeliling() + "\n" +
        "Luas : " + hitungLuas();
    }
    
}
