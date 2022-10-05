//created by 21343058_Muhammad Farel Fahlevi

package Tugas;
import java.util.Scanner;
public class Tugas2b {
    public static void main(String []args) {
        Scanner inputnilai = new Scanner(System.in);

        int Angka;

        System.out.print("Masukkan Angka: ");
        Angka = inputnilai.nextInt();

        switch (Angka) {
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            case 4:
                System.out.println("Empat");
                break;
            case 5:
                System.out.println("Lima");
                break;
            case 6:
                System.out.println("Enam");
                break;
            case 7:
                System.out.println("Tujuh");
                break;
            case 8:
                System.out.println("Delapan");
                break;
            case 9:
                System.out.println("Sembilan");
                break;
            case 10:
                System.out.println("Sepuluh");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
    }
}
