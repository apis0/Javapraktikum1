package Mahasiswa;

import java.text.ParseException;

import Mahasiswa.Mahasiswa;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws ParseException {
        Mahasiswa m1 = new Mahasiswa("19630079", "Akhmad Hafiz Ansyari", "02-07-2000");
        m1.tampilAtribut();
        System.out.println(m1.getNama());
    }
}