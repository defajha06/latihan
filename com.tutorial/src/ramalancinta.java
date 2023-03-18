import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
public class ramalancinta {
    public static void main(String[] args) {
        //code yang dapat mengubah meter menjadi cm
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        System.out.print("\n");

        System.out.println("Selamat Datang di Program Ramalan Cupu");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        System.out.println("Data Anda");
        System.out.print("Masukkan Nama Anda: ");
        String name1 = input.nextLine();
        System.out.print("Masukkan Umur Anda: ");
        int umur1 = input.nextInt();
        input.nextLine();
        System.out.println();

        System.out.println("Data Pasangan Anda");
        System.out.print("Masukkan Nama Pasangan Anda: ");
        String name2 = input.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda: ");
        int umur2 = input.nextInt();
        input.nextLine();

        System.out.println();

        System.out.println(name1 + " [" + umur1 + "] tahun");
        System.out.println();
        final int size = 3;
        for (int m = 0; m < size; m++) {
            for (int n = 0; n < 5 * size; n++) {
                double post1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));
                double post2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));

                if (post1 < size + 0.5 || post2 < size + 0.5) {
                    System.out.print('♥');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        for (int m = 1; m <= 2 * size; m++) {
            for (int n = 0; n < m; n++) {
                System.out.print(' ');
            }
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {
                System.out.print('♥');
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(name2 + " [" + umur2 + "] tahun");
        System.out.println();
        System.out.println("Tekan ENTER untuk melihat hasil kecocokan....");
        breakConsule();

        double value = random.nextDouble() * 100;
        while (value < 50) ;
        value = random.nextDouble() * 100;
        System.out.print("Kecocokan Anda dengan Pasangan Anda adalah " + String.format("%.2f", value) + " %");
        System.out.print("\n\nTerima kasih karena Anda telah menggunakan jasa kami.. ^^v");
        input.close();


    }

    private static void breakConsule() {
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







