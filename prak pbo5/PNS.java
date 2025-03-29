// Nama: Mohammad Rajaswa Umar - 24060123140121
// Deskripsi: Subkelas untuk PNS
// Tanggal: 23 - Maret - 2025

import java.time.LocalDate;

public class PNS extends Manusia {
    private static int counterPNS = 0;
    private String nip;

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        int A = Integer.parseInt(nip.substring(13, 14));  
        return 0.1 * pendapatan + A;  
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Pajak: " + hitungPajak());
    }

}
