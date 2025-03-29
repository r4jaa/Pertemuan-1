// Nama: Mohammad Rajaswa Umar - 24060123140121
// Deskripsi: Kelas induk untuk semua jenis manusia
// Tanggal: 23 - Maret - 2025

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;

    // Konstruktor
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    public static int getCounterMns() {
        return counterMns;
    }
    public long hitungMasaKerja() {
        return ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
    }
    public double hitungPajak() {
        return 0;  
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
    }
}
