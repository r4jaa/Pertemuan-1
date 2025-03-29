// Nama: Mohammad Rajaswa Umar - 24060123140121
// Deskripsi: Program utama untuk menguji sistem pajak dan masa kerja
// Tanggal: 23 - Maret - 2025

import java.time.LocalDate;
public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Joko", LocalDate.of(2001, 7, 11), "Jl. Semanggi", 11000000, "198302032006041999");
        Pengusaha pe1 = new Pengusaha("Supriyanto", LocalDate.of(2003, 4, 19), "Jl. Nangka", 66000000, "000-546-703-262-000-1");
        Petani pt1 = new Petani("Rudolf", LocalDate.of(1990, 3, 29), "Jl. Tologsari 122", 5900000, "Kudus");
        PNS p2 = new PNS("Panji", LocalDate.of(2011, 9, 21), "Jl. Pemuda Kudus", 10000000, "198004212010041332");

        p2.setAlamat("Jl. Pemuda Kudus");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}
