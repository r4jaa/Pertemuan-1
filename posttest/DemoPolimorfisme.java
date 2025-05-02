// Superclass
class Pegawai {
    protected String nama;
    protected String nip;

    public Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public void info() {
        System.out.println("Pegawai: " + nama + " (NIP: " + nip + ")");
    }
}


// Subclass Dosen
class Dosen extends Pegawai {
    private String matakuliah;

    public Dosen(String nama, String nip, String matakuliah) {
        super(nama, nip);
        this.matakuliah = matakuliah;
    }

    @Override
    public void info() {
        System.out.println("Dosen: " + nama + " (NIP: " + nip + "), Mengajar: " + matakuliah);
    }
}


// Subclass Staff
class Staff extends Pegawai {
    private String bagian;

    public Staff(String nama, String nip, String bagian) {
        super(nama, nip);
        this.bagian = bagian;
    }

    @Override
    public void info() {
        System.out.println("Staff: " + nama + " (NIP: " + nip + "), Bagian: " + bagian);
    }
}


// Main class
public class DemoPolimorfisme {
    public static void main(String[] args) {
        Pegawai[] pegawais = new Pegawai[3];

        pegawais[0] = new Dosen("Dr. Deddy Corbuzier S.Si., M.Cs.", "1985112234567001", "Dasar Pemrograman");
        pegawais[1] = new Staff("Dono Kasino", "1982198765418032001", "Administrasi");
        pegawais[2] = new Dosen("Agus Tina S.Kom., M.Kom.", "199606187662001", "Manajemen Basis Data");

        for (Pegawai p : pegawais) {
            p.info();
        }
    }
}

