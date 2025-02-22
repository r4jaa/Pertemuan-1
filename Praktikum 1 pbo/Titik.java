public class Titik {
    //*ATRIBUT*\\
    double absis;
    double ordinat;
    double dx,dy;
    static int counterTitik = 0;

    //*METHOD*\\
    Titik(double absis , double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // konstruktor untuk membuat titik (0,0)
    Titik() {
        this(0,0);
    }

    // Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
    absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
    ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
    absis = absis + x;
    ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    void printTitik() {
    System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printcounterTitik() {
        System.out.println(this.counterTitik);
    } 

    // Mengembalikan kuadran tempat titik berada
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1; // Kuadran I
        } else if (absis < 0 && ordinat > 0) {
            return 2; // Kuadran II
        } else if (absis < 0 && ordinat < 0) {
            return 3; // Kuadran III
        } else if (absis > 0 && ordinat < 0) {
            return 4; // Kuadran IV
        } else {
            return 0; // Titik berada di sumbu atau pusat (0,0)
        }
    }

    // Mengembalikan jarak titik dari pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Mengembalikan jarak antara dua titik
    double getJarak(Titik T) {
     dx = T.absis - this.absis;
     dy = T.ordinat - this.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }  

    // Refleksi X
    void RefleksiX() {
        absis = absis * (-1);
    }

    // Refleksi Y
    void RefleksiY() {
        ordinat = ordinat * (-1);
    }
    // Get Refleksi X
    Titik getRefleksiX() {
        return new Titik (this.absis, -this.ordinat);
    }

    // Get Refleksi Y
    Titik getRefleksiY() {
        return new Titik (-this.absis, this.ordinat);
    }
    
    @Override
    public String toString() {
        int xInt = (int) getAbsis();
        int yInt = (int) getOrdinat();
        if (getAbsis() == xInt && getOrdinat() == yInt) {
            return "(" + xInt + ", " + yInt + ")";
        } else {
            return "(" + getAbsis() + ", " + getOrdinat() + ")";
        }
    }  
}   

    // end class Titik