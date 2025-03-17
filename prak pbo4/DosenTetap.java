import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class DosenTetap extends Dosen {
    private String NIDN;
    private int BUP = 65;

    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, String fakultas, String NIDN){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public int hitungTunjangan(){
        return super.hitungTunjangan(0.02);
    }

    public void printBUP() {
        LocalDate bupDate = getTanggalLahir().plusYears(BUP).with(TemporalAdjusters.firstDayOfNextMonth());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        System.out.println("BUP Dosen Tetap: " + bupDate.format(formatter));
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("Tunjangan: RP. " + hitungTunjangan());
        printBUP();
    }
}
