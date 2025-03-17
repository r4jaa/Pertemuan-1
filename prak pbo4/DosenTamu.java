import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen{
    private String NIDK;
    private LocalDate akhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, String fakultas, String NIDK, LocalDate akhirKontrak){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public LocalDate getAkhirKontrak(){
        return akhirKontrak;
    }

    public void setAkhirKontrak(LocalDate akhirKontrak){
        this.akhirKontrak = akhirKontrak;
    }

    public int hitungTunjangan(){
        return super.hitungTunjangan(0.025);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        System.out.println("NIDK: " + NIDK);
        System.out.println("Masa Akhir Kontrak: " + akhirKontrak.format(formatter));
        System.out.println("Tunjangan: RP. " + hitungTunjangan());
    }
    
}
