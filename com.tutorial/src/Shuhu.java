import java.util.Scanner;
public class Shuhu {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("-Konversi suhu dari celcius ke dalam fahrenheit dan kelvin-");
            System.out.print("Masukkan suhu dalam celcius: ");
            double celcius = input.nextFloat();
            double fahrenheit = (celcius * 9/5) + 32;
            double kelvin = celcius + 273.15;
            System.out.println("Suhu " + celcius + " °C (Celcius) sama dengan " + fahrenheit + " °F (Fahrenheit) sama dengan " + kelvin + " °K (Kelvin).");
        }
    }
