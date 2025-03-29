public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5.0, "Merah", "Garis Putus-putus");
        System.out.println("Informasi Persegi:");
        persegi.tampilPersegi();

        // Zoom In dan Zoom Out
        persegi.zoomIn();
        System.out.println("Setelah Zoom In:");
        persegi.tampilPersegi();

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(7.0, "Biru", "Garis Solid");
        System.out.println("Informasi Lingkaran:");
        lingkaran.tampilLingkaran();

        // Zoom In dan Zoom Out
        lingkaran.zoomOut();
        System.out.println("Setelah Zoom Out:");
        lingkaran.tampilLingkaran();

        // Membandingkan luas dan keliling
        System.out.println("Persegi dan Lingkaran memiliki luas yang sama: " + persegi.isEqualLuas(lingkaran));
        System.out.println("Persegi dan Lingkaran memiliki keliling yang sama: " + persegi.isEqualKeliling(lingkaran));
    }
}
