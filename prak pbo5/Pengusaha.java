// Nama: Mohammad Rajaswa Umar - 24060123140121
// Deskripsi: Subkelas untuk Pengusaha
// Tanggal: 23 - Maret - 2025

import java.time.LocalDate;

public class Pengusaha extends Manusia {
    private static int counterPengusaha = 0;
    private String npwp;

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        int B = Integer.parseInt(npwp.substring(12, 13));  
        return 0.15 * pendapatan + B;  
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Pajak: " + hitungPajak());
    }
}
