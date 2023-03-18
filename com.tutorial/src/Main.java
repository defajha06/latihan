import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //code yang dapat mengubah meter menjadi cm
        Scanner input = new Scanner(System.in);
        System.out.println("-Alat Konversi Meter ke Centimeter-");
        System.out.println("Masukkan angka dalam meter");
        double meter = input.nextDouble();
        double centimeter = meter*100;

        System.out.println(meter + " meter (m) sama dengan = " + centimeter + " centimeter (cm)");
    }

}

