package com.example.applicationuas;

public class QuizGanda {
    public String Pertanyaan[] = {
            "Hewan apa yang berkaki empat?",
            "Hewan yang hidup didalam air?",
            "Hewan apa yang memiliki belalai yang sangat panjang?",
            "Hewan apa yang suka bergelantungan di pohon?",
            "Hewan apa yang mempunyai tempurung badan?"
    };
    private String PilihanJawaban[][] = {
            {"Sapi", "Ayam", "Bebek", "Cacing"},
            {"Kambing", "Ikan", "Kuda", "Harimau"},
            {"Monyet", "Jerapah", "Singa", "Gajah"},
            {"Tupai", "Angsa", "Kura-Kura", "Semut"}
    };
    private String JawabanBenar[] = {
            "Sapi",
            "Ikan",
            "Gajah",
            "Monyet",
            "Kura-Kura"
    };
    public String getPertanyaan(int x) {
        String soal = Pertanyaan[x];
        return soal;
    }
    public String getPilihanJawaban1(int x) {
        String jawaban1 = PilihanJawaban[x][0];
        return  jawaban1;
    }
    public String getPilihanJawaban2(int x) {
        String jawaban2 = PilihanJawaban[x][0];
        return  jawaban2;
    }
    public String getPilihanJawaban3(int x) {
        String jawaban3 = PilihanJawaban[x][0];
        return  jawaban3;
    }
    public String getJawabanBenar(int x) {
        String jawaban = JawabanBenar[x];
        return jawaban;
    }
}
