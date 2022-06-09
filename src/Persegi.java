public  class Persegi extends BangunDatar {
    // Deklarasi
    private double sisi;

    // Constructor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    //Getter
    public double getSisi() {
        return sisi;
    }
    // Setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // implementasi method abstract (extend BangunDatar)
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public String toString() {
        return "\t( PERSEGI )\n" + 
        "Sisi : " + sisi + "\n" +
        "Keliling : " + hitungKeliling() + "\n" +
        "Luas : " + hitungLuas();
    }
    
}
