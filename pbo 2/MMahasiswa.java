public class MMahasiswa{
    public static void main(String[] args){
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa Raja = new Mahasiswa("121","Raja","Informatics");
        Dosen Aris = new Dosen("023","Aris","Sistem Informasi");
        Kendaraan Mobil1 = new Kendaraan("N 1 SA","mobil");
        Raja.setDosenWali(Aris);
        Raja.setKendaraan(Mobil1);
        Raja.addMatkul(MBD);
        Raja.addMatkul(PBO);
        Raja.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + Raja.getJumlahMatKul());
        System.out.println("Jumlah SKS: " + Raja.getJumlahSks());
    }
}