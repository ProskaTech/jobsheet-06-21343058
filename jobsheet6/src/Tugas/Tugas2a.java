//created by 21343058_Muhammad Farel Fahlevi

package Tugas;

import java.util.Scanner;

public class Tugas2a {
    public static void main(String []args) {
        Scanner inputnilai = new Scanner(System.in);

        int Angka;

        System.out.print("Masukkan Angka: ");
        Angka = inputnilai.nextInt();

        if (Angka == 1) {
            System.out.println("Satu");
        }
        else if (Angka == 2) {
            System.out.println("Dua");
        }
        else if (Angka == 3) {
            System.out.println("Tiga");
        }
        else if (Angka == 4) {
            System.out.println("Empat");
        }
        else if (Angka == 5) {
            System.out.println("Lima");
        }
        else if (Angka == 6) {
            System.out.println("Enam");
        }
        else if (Angka == 7) {
            System.out.println("Tujuh");
        }
        else if (Angka == 8) {
            System.out.println("Delapan");
        }
        else if (Angka == 9) {
            System.out.println("Sembilan");
        }
        else if (Angka == 10) {
            System.out.println("Sepuluh");
        } else {
            System.out.println("Invalid Number");
        }
        
    }
}
