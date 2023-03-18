import java.util.Scanner;
public class tambahstok {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String name = input.nextLine();

        System.out.println("Stok Gudang Input Barang");
        System.out.println("#########################");
        System.out.println("Selamat Datang " + name);

        System.out.print("Masukkan nama barang yang mau ditambah : ");
        String barang = input.nextLine();
        System.out.print("Masukkan jumlah barang yang mau ditambah : ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan harga beli untuk barang tersebut : ");
        double beli = input.nextDouble();
        System.out.print("Masukkan harga jual untuk barang tersebut : ");
        double jual = input.nextDouble();

        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("#########################");
        System.out.println("Nama Barang : " + barang);
        System.out.println("Jumlah Barang : " + jumlah);
        System.out.println("Harga Beli : Rp" + String.format("%.2f", beli));
        System.out.println("Harga Jual : Rp" + String.format("%.2f", jual));

    }
}
