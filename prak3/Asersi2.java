class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungkeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main (String[]args){
        double jarijari=0;
        assert(jarijari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran (jarijari) ;
        double kelilinglingkaran = l. hitungkeliling();
        System.out.println("keliling lingkaran ="
        +kelilinglingkaran);
    }
}

// Asersi yang tidak tepat, sebaiknya untuk pengecekan bisa menggunakan if untuk memvalidasi input
// nilai jari-jari yang tidak valid, sebaiknya ubah nilai jari-jari menjadi positif