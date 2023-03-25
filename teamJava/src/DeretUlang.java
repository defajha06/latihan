import java.util.Scanner;

public class DeretUlang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input nama
        String nama = null;
        boolean ketentuanNama = true;
        while (ketentuanNama) {
            System.out.print("Masukkan Nama Anda [1..25] : ");
            nama = input.nextLine();
            if (nama.length()<1) {
                System.out.println("Mohon masukkan nama Anda...");
            } else if (nama.length()>25) {
                System.out.println("Maksimal 25 karakter...");
            } else {
                ketentuanNama = false;}
        }


        //Input NIM
        String nim = null;
        boolean ketentuanNim = true;
        while (ketentuanNim) {
            System.out.print("Masukkan NIM Anda [harus 10 karakter] : ");
            nim = input.nextLine();
            if (nim.matches("\\d{3}")){
                ketentuanNim = false;
            } else {
                System.out.println("Mohon masukkan NIM dengan benar (10 karakter)...");
            }
        }
        System.out.println("");
        System.out.println("@".repeat(100));
        System.out.println("");
        System.out.println("Validasi Sukses..");
        System.out.println("Selamat datang "+nama+" [NIM : "+nim+"].. ^^v\n");


            System.out.println("Mari belajar macam-macam deret bilangan..\n");
            System.out.println("@".repeat(100));
            System.out.println("");

        while (true) {
            int angka = 0;
            boolean ketentuanAngka = true;
            while (ketentuanAngka) {
                System.out.print("Masukkan Sembarang Angka [5..20] : ");
                angka = input.nextInt();
                if (angka >= 5 && angka <= 20) {
                    ketentuanAngka = false;
                } else {
                    System.out.println("Masukkan angka 5-20...");
                }
            }

            System.out.println("");
            System.out.println("@".repeat(100));
            System.out.println("\nDeret Bilangan");
            System.out.println("#".repeat(15));
            System.out.println("");

            //Bilangan Genap
            System.out.println(" " + angka + " Bilangan Genap : ");
            int jmlGenap = 1, genap, totalGenap = 0;
            for (genap = 1; jmlGenap <= angka; genap++) {
                if (genap % 2 == 0) {
                    System.out.print(genap + " ");
                    jmlGenap = jmlGenap + 1;
                    totalGenap += genap;
                }
            }
            System.out.println("\nHasil Penjumlahan = " + totalGenap);
            System.out.println("");

            //Bilangan Ganjil
            System.out.println(" " + angka + " Bilangan Ganjil : ");
            int jmlGanjil = 1, ganjil, totalGanjil = 0;
            for (ganjil = 1; jmlGanjil <= angka; ganjil++) {
                if (ganjil % 2 != 0) {
                    System.out.print(ganjil + " ");
                    jmlGanjil = jmlGanjil + 1;
                    totalGanjil += ganjil;
                }
            }
            System.out.println("\nHasil Penjumlahan = " + totalGanjil);
            System.out.println("");

            //Deret Fibonacci
            System.out.println(" " + angka + " Bilangan Fibonacci : ");
            int a = 1, b = 1, value = 0, totalFibo = 0;
            while (value < angka) {
                if (value < angka) {
                    System.out.print(a + " ");
                    a = a + b;
                    value++;
                }
                if (value < angka) {
                    System.out.print(b + " ");
                    b = b + a;
                    value++;
                }
                totalFibo += a;
            }
            System.out.println("\nHasil Penjumlahan = " + totalFibo);
            System.out.println("");

            //Perulangan

            boolean pilihan = true;
            while(pilihan) {
                String jawab = input.nextLine();
                if (jawab.equalsIgnoreCase("T")) {
                    System.out.println("Terima kasih..");
                    System.exit(0);
                } if (jawab.equalsIgnoreCase("Y")) {
                    pilihan = false;
                } else {
                    System.out.print("Anda ingin mengulang [Y/T]: ");
                }
            }
        }
    }
}
