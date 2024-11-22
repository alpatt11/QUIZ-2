import java.text.SimpleDateFormat;
import java.util.Date;

public class SoalQuiz04_01 {
    public static void main(String[] args) {
        
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        
        Date tgl = new Date();
        
        
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd");
        SimpleDateFormat formatBulan = new SimpleDateFormat("MM");
        SimpleDateFormat formatTahun = new SimpleDateFormat("yyyy");
        
        
        int tanggal = Integer.parseInt(formatTanggal.format(tgl));
        int bulan = Integer.parseInt(formatBulan.format(tgl)) - 1; 
        String tahun = formatTahun.format(tgl);
        
        
        System.out.printf("%d %s %s", tanggal, namaBulan[bulan], tahun);
    }
}