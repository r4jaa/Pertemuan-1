public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        T1.setAbsis(3); // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // mencetak koordinat T1 ke layar
        T1.geser(3,4); // menggeser T1 sejauh (3,4)
        T1.printTitik(); // menampilkan koordinat T1 setelah digeser
        
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(); //Menbuat objek titik T1 (0,0)
        Titik T4 = new Titik(3,5); //membuat objek titik T2 (3,5)
        Titik T5 = new Titik(7,5);

        System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());

        System.out.println("Titik T4 ada di kuadran: " + T4.getKuadran());

        System.out.println("Jarak T4 ke pusat: " + T4.getJarakPusat());

        System.out.println("Jarak antara T4 dan T5: " + T4.getJarak(T5));
        
        Titik RefleksiX;
        Titik RefleksiY;

        RefleksiX = T4.getRefleksiX();
        System.out.println("Refleksi T4 terhadap sumbu X = (" + RefleksiX.getAbsis() +", " + RefleksiX.getOrdinat() +")");

        RefleksiY = T4.getRefleksiY();
        System.out.println("Refleksi T4 terhadap sumbu Y = (" + RefleksiY.getAbsis() +", " + RefleksiY.getOrdinat() +")");

    }
}