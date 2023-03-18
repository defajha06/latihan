import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class bungarResto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Seting Salam
        int jam = LocalDateTime.now().getHour();
        String waktu = "";
        if (jam <= 10) {
            waktu = "pagi";
        } else if (jam <= 14) {
            waktu = "siang";
        } else if (jam <= 17) {
            waktu = "sore";
        } else {
            waktu = "malam";
        }
        System.out.printf("\n\t\tSelamat %s...\n", waktu);

        // Input Data Pesanan
        int jmlOrang = 0;
        boolean nilai = true;
        while (nilai) {
            System.out.printf("%s%3s","\t\tPesan untuk berapa orang",": ");
            try {
                jmlOrang = Integer.parseInt(String.valueOf(input.nextLine()));
                if (jmlOrang < 1) {
                    System.out.println("\t\tMinimal ada 1 orang..");
                } else {
                    nilai = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("\t\tMohon masukkan angka..");
            }
        }

        System.out.printf("%s%10s","\t\tPesanan atas nama",": ");
        String namaPemesan = input.nextLine();

        // Daftar Harga
        List<Map> menus = List.of(
                Map.of("name","Nasi Goreng Spesial","price",9999.99),
                Map.of("name","Ayam Bakar Spesial","price",12345.67),
                Map.of("name","Steak Sirloin Spesial","price",21108.40),
                Map.of("name","Kwetiaw Siram Spesial","price",13579.13),
                Map.of("name","Kambing Guling Spesial","price",98765.43)
        );
        System.out.println("\n\t\tMenu Spesial hari ini");
        System.out.println("\t\t"+"=".repeat(21));
        int angka = 1;
        for (Map menu: menus) {
            System.out.printf("\t\t%d. %-30s@ Rp. %8.2f %n", angka, menu.get("name"), menu.get("price"));
            angka++;
        }

        // Input Jumlah Pesanan
        System.out.println("\nPesanan Anda (batas pesanan 0-10 porsi):");
        List<Integer> orders = new ArrayList();
        angka = 1;
        for (Map menu: menus) {
            nilai = true;
            while (nilai) {
                System.out.printf("%d. %-25s= ", angka, menu.get("name"));
                try {
                    int order = Integer.parseInt(String.valueOf(input.nextLine()));
                    if (order >= 0 && order <= 10) {
                        orders.add(order);
                        angka++;
                        nilai = false;
                    } else {
                        System.out.println("Maksimal 10 porsi..");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Mohon masukkan angka..");
                }
            }
        }

        ///// Tagihan /////
        System.out.println("\n\nSelamat menikmati makanan anda...\n");
        System.out.println("Pembelian:");
        double totalHarga = 0;
        for (int i = 1; i <= menus.size(); i++) {
            double menuHarga = (double)menus.get(i-1).get("price");
            double itemHarga = menuHarga * orders.get(i-1);
            totalHarga += itemHarga;
            String plus = (i < menus.size()) ? "" : " +";
            System.out.printf(
                    "%d. %-25s %2d porsi * Rp. %8.2f  =  Rp. %15.2f%s%n",
                    i,
                    menus.get(i-1).get("name"),
                    orders.get(i-1),
                    menuHarga,
                    itemHarga,
                    plus
            );
        }
        System.out.println("=".repeat(78));
        System.out.printf("%-54s=  Rp. %15.2f%n", "Total Pembelian", totalHarga);

        // Diskon
        double discount = totalHarga / 10;
        System.out.printf("%-54s=  Rp. %15.2f -%n", "Disc. 10% (Masa Promosi)", discount);
        System.out.println("=".repeat(78));
        double finalPrice = totalHarga - discount;
        System.out.printf("%-54s=  Rp. %15.2f%n", "Total Pembelian setelah disc 10%", finalPrice);

        // Personal price
        double personalPrice = finalPrice / jmlOrang;
        String personalStatement = String.format("Pembelian per orang (untuk %d orang)", jmlOrang);
        System.out.printf("%-54s=  Rp. %15.2f%n%n", personalStatement, personalPrice);

        System.out.printf("%25sTerima kasih atas kunjungan Anda...%n", " ");
        System.out.printf("%25s...tekan ENTER untuk keluar...", " ");
        if (input.hasNextLine()) {
            System.exit(0);
        }
    }
}