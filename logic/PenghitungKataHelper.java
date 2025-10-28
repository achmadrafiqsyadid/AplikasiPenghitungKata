package Tugas5.helper;

public class PenghitungKataHelper {

    public static int hitungKata(String teks) {
        if (teks == null || teks.trim().isEmpty()) return 0;
        String[] kata = teks.trim().split("\\s+");
        return kata.length;
    }

    public static int hitungKarakter(String teks) {
        if (teks == null) return 0;
        return teks.length();
    }

    public static int hitungKalimat(String teks) {
        if (teks == null || teks.trim().isEmpty()) return 0;
        String[] kalimat = teks.trim().split("[.!?]+");
        return kalimat.length;
    }

    public static int hitungParagraf(String teks) {
        if (teks == null || teks.trim().isEmpty()) return 0;
        String[] paragraf = teks.trim().split("\\n+");
        return paragraf.length;
    }

    public static int cariKata(String teks, String kataDicari) {
        if (teks == null || teks.trim().isEmpty() || kataDicari.trim().isEmpty()) return 0;
        String[] kata = teks.toLowerCase().split("\\s+");
        int jumlah = 0;
        for (String k : kata) {
            if (k.equals(kataDicari.toLowerCase())) jumlah++;
        }
        return jumlah;
    }
}
