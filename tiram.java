
package tugaspresentasi;

public class tiram extends Jamur{
       public String nama;
    private final String namaIlmiah = "Pleurotus osttreatus";
    private final String caraBB = "Fragmentasi";
    private final String panjangTubuh = "8 - 20";
    int hidup;

    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getNama() {
        return nama;
    }
    public void cetak() {
        super.strukturTubuh();
        super.mencariMakanan();
        super.habitat();

        System.out.println("nama tumbuhan\t\t\t:" + nama);
        System.out.println("nama ilmiah\t\t\t:" + namaIlmiah);
        System.out.println("cara berkembang biak\t\t:" +caraBB);
        System.out.println("rata - rata panjang tubuh\t:" + panjangTubuh + "cm");
    }
    void lamaHidup(int hidup) {
        System.out.println("rata - rata lama hidupnya adalah " + hidup + " tahun");
    }
} 
