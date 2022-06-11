public class Main {
    public static void main(String[] args) {
        // instansiasi
        Persegi persegi = new Persegi(8);
        System.out.println(persegi);
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 10);
        System.out.println(persegiPanjang);

        // persegi.setSisi(5);
        // System.out.println("Keliling : " + persegi.hitungKeliling());
        // System.out.println("Luas : " + persegi.hitungLuas());
    }
}
