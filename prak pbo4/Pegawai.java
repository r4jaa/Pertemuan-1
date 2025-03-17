import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    private String NIP;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate TMT;
    private int gajiPokok;
    
    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok; 
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggalLahir(){
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public int getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public String masa_kerja(){
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    public int hitungTunjangan(double persen) {
        return (int) (persen * Period.between(TMT, LocalDate.now()).getYears() * gajiPokok);
    }
    
    public void printInfo(){
        DateTimeFormatter formatterTanggal = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        DateTimeFormatter formatterTMT = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(formatterTanggal));
        System.out.println("Terhitung Mulai Tanggal(TMT): " + TMT.format(formatterTMT));
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Masa Kerja: " + masa_kerja());
    }
}
