
package Mahasiswa;


import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm;
    public String nama;
    Date tanggalLahir;
    final String POLA_TANGGAL = "dd-MM-yyyy";
    final SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");

    public Mahasiswa() {
    }

    public Mahasiswa(String npm, String nama, String tanggalLahir) throws ParseException {
        this.npm = npm;
        this.setNama(nama);

        try {
            this.tanggalLahir = this.SDF.parse(tanggalLahir);
        } catch (ParseException var5) {
            System.err.println("Kesalahan pada tanggal lahir");
        }

    }

    public void tampilAtribut() {
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);
        System.out.println("Nama \t\t\t : " + this.getNama());
        System.out.println("NPM \t\t\t : " + this.npm);
        PrintStream var10000 = System.out;
        String var10001 = simpleDateFormat.format(this.tanggalLahir);
        var10000.println("Tanggal Lahir \t : " + var10001);
    }

    void menyapa() {
        System.out.println("Hai nama aku : " + this.getNama());
    }

    int hitungUsia() {
        Calendar tanggalLahir = Calendar.getInstance();
        tanggalLahir.setTime(this.tanggalLahir);
        Calendar hariIni = Calendar.getInstance();
        int selisihTahun = hariIni.get(1) - tanggalLahir.get(1);
        if (hariIni.get(2) < tanggalLahir.get(2)) {
            --selisihTahun;
        } else {
            if (hariIni.get(2) == tanggalLahir.get(2) && hariIni.get(5) < tanggalLahir.get(5)) {
            }

            --selisihTahun;
        }

        return selisihTahun;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}