import java.util.Scanner;
public class bungarfahmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Input Nama */
        System.out.println("Selamat Siang...");
        System.out.println("Pesan untuk berapa orang : ");
        int jumlah_orang = input.nextInt();
        System.out.println("Pesanan atas nama :");
        String nama_pemesan = input.next();

        /* Variabel harga satuan produk */
        double nasi_goreng = 9999.99;
        double ayam_bakar = 12345.67;
        double steak_sirloin = 21108.40;
        double kwetiaw = 13579.13;
        double kambing_guling = 98765.43;

        /* Menampilkan tampilan menu dan harga*/
        System.out.println("Menu Spesial hari ini");
        System.out.println("=====================");
        System.out.println("1. Nasi Goreng Spesial           " + "@  Rp. " + nasi_goreng);
        System.out.println("2. Ayam Bakar Spesial            " + "@  Rp. " + ayam_bakar);
        System.out.println("3. Steak Sirloin Spesial         " + "@  Rp. " + steak_sirloin);
        System.out.println("4. Kwetiaw Siram Spesial         " + "@  Rp. " + kwetiaw);
        System.out.println("5. Kambing Guling Spesial        " + "@  Rp. " + kambing_guling);

        /* Menampilkan tampilan input pesanan */
        System.out.println("Pesanan Anda [Batas Pesanan 0-10]");
        System.out.println("1. Nasi Goreng Spesial");
        int jum_nasi_goreng = input.nextInt();
        System.out.println("2. Ayam Bakar Spesial");
        int jum_ayam_bakar = input.nextInt();
        System.out.println("3. Steak Sirloin Spesia");
        int jum_steak_sirloin = input.nextInt();
        System.out.println("4. Kwetiaw Siram Spesial");
        int jum_kwetiaw = input.nextInt();
        System.out.println("5. Kambing Guling Spesial");
        int jum_kambing_guling = input.nextInt();

        /* Membuat variabel total harga pembelian per produk*/
        double beli_nasi_goreng = jum_nasi_goreng * nasi_goreng;
        double beli_ayam_bakar = jum_ayam_bakar * ayam_bakar;
        double beli_steak_sirloin = jum_steak_sirloin * steak_sirloin;
        double beli_kwetiaw = jum_kwetiaw * kwetiaw;
        double beli_kambing_guling = jum_kambing_guling * kambing_guling;


        /* Menampilkan perhitungan pesanan pelanggan beserta harga */
        System.out.println("Selamat menikmati makanan anda...");
        System.out.println("Pembelian : ");
        System.out.println("1. Nasi Goreng Spesial     " + jum_nasi_goreng + " porsi     * " + "Rp. " + nasi_goreng + " = " + " Rp.  " + beli_nasi_goreng);
        System.out.println("2. Ayam Bakar Spesial      " + jum_ayam_bakar + " porsi     * " + "Rp. " + ayam_bakar + " = " + " Rp.  " + beli_ayam_bakar);
        System.out.println("3. Steak Sirloin Spesial   " + jum_steak_sirloin + " porsi     * " + "Rp. " + steak_sirloin + " = " + " Rp.  " + beli_steak_sirloin);
        System.out.println("4. Kwetiaw Siram Spesial   " + jum_kwetiaw + " porsi     * " + "Rp. " + kwetiaw + " = " + " Rp.  " + beli_kwetiaw);
        System.out.println("5. Kambing Guling Spesial  " +jum_kambing_guling + " porsi     * " + "Rp. " + kambing_guling + " = " + " Rp.  " + beli_kambing_guling + "                                     + ");
        System.out.println("=============================================================================================================");

        /* Membuat variabel total pembelian */
        double total_pembelian = beli_nasi_goreng + beli_ayam_bakar + beli_steak_sirloin + beli_kwetiaw + beli_kambing_guling;
        System.out.println("Total Pembelian                                                                            " + " = " + " Rp.  " + total_pembelian);

        /* Membuat variabel total diskon pembelian */
        double diskon_10_persen = total_pembelian * 10/100;
        System.out.println("Disc. 10 % <Masa Promosi>                                                                  " + " = " + " Rp.  " + diskon_10_persen + " - ");
        System.out.println("=============================================================================================================");

        /* Membuat variabel pembelian setelah diskon */
        double beli_setelah_diskon = total_pembelian - diskon_10_persen;
        System.out.println("Total Pembelian setelah disc 10 %                                                          " + " = " + " Rp.  " + beli_setelah_diskon);
        /* Membuat variabel harga yang harus dibayar per orang */
        double beli_per_orang = beli_setelah_diskon / jumlah_orang;
        System.out.println("Pembelian per orang <untuk " + jumlah_orang + "> orang                                                       " + " = " + " Rp.  " + beli_per_orang);

        System.out.println("                              Terima Kasih atas kunjuangan Anda...                              ");
        System.out.println("                              ...tekan ENTER untuk keluar...                             ");
        try{System.in.read();}
        catch(Exception e){};
    }
}