
package tugaspresentasi;

public class hasil {
       public static void main(String[] args) {

        System.out.println("contoh 1 jamur (fungi)");
        System.out.println("");
        tiram Tiram = new tiram();
        Tiram.setNama("Tiram");
        Tiram.cetak();

        tiram hitung = new tiram();
        hitung.lamaHidup(12);

        System.out.println("");
        System.out.println("Contoh 2 jamur (fungi)");

        System.out.println("");
        kuping Kuping = new kuping();
        Kuping.setNama("Kuping");
        Kuping.cetak();
    }
} 

