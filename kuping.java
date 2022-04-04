
package tugaspresentasi;

public class kuping extends tiram {
    public String nama;
    private final String namaIlmiah = "Aulicularia auricula-judae";
    private final String caraBB = "Tunas";
    private final String makanan = "Tunas";
    private final String panjangTubuh = "6 - 10";
    int hidup;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void cetak() {
        super.strukturTubuh();
        super.mencariMakanan();
        super.habitat();

        System.out.println("nama tumbuhan\t\t\t:" + nama);
        System.out.println("nama ilmiah\t\t\t:" + namaIlmiah);
        System.out.println("cara berkembang biak\t\t:" + makanan);
        System.out.println("rata - rata panjang tubuh\t:" + panjangTubuh + "cm");
    
    }
    void lamaHidup(int hidup) {
        System.out.println("rata - rata lama hidupnya adalah " + hidup + " tahun");
}
}

