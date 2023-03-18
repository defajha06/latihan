import java.util.Scanner;
public class LowerUpper {
    public static void main(String[] args) {
        System.out.println("-membaca dua string dan mengubahnya menjadi huruf kecil dan huruf besar-");
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan string pertama: ");
        String string1 = input.nextLine();

        System.out.println("Masukkan string kedua: ");
        String string2 = input.nextLine();

        String lowercase1 = string1.toLowerCase();
        String uppercase1 = string1.toUpperCase();
        String lowercase2 = string2.toLowerCase();
        String uppercase2 = string2.toUpperCase();

        System.out.println("String pertama: " + string1 + "; String kedua: " + string2);
        System.out.println("String pertama diubah menjadi huruf kecil: " + lowercase1);
        System.out.println("String pertama diubah menjadi huruf besar: " + uppercase1);
        System.out.println("String kedua diubah menjadi huruf kecil: " + lowercase2);
        System.out.println("String kedua diubah menjadi huruf besar: " + uppercase2);
    }
}
