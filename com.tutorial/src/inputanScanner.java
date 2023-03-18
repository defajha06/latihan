import java.util.Scanner;
public class inputanScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String name = input.nextLine();
        System.out.println("Nama Anda : " + name);
    }
}
