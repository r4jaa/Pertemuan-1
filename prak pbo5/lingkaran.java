public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;

    // Konstruktor tanpa parameter
    public Lingkaran() {
        setJmlSisi(0);
    }

    // Konstruktor dengan parameter
    public Lingkaran(double jariJari, String warna, String border) {
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double getLuas() {
        // Menghitung dan mengembalikan luas lingkaran
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double getKeliling() {
        // Menghitung dan mengembalikan keliling lingkaran
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void zoomIn() {
        jariJari = jariJari * 1.1;
    }

    @Override
    public void zoomOut() {
        jariJari = jariJari * 0.9;
    }

    public void tampilLingkaran() {
        tampilBangunDatar();
        System.out.println("Jari-Jari: " + jariJari);
        System.out.println("Luas Lingkaran: " + getLuas());
        System.out.println("Keliling Lingkaran: " + getKeliling());
    }
}
