import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class inputanBufferReader {
    public static void main(String[] args){
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(reader);
            System.out.print("Masukkan Nama: ");
            String name = input.readLine();
            System.out.println("Nama Anda : "+name);
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
