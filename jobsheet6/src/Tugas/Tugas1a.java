//created by 21343058_Muhammad Farel Fahlevi

package Tugas;

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;

public class Tugas1a {
    public static void main(String []args) {
    BufferedReader Nilai = new BufferedReader (new InputStreamReader (System.in));
      String n1 = ""; 
      String n2 = ""; 
      String n3 = "";

try {
       System.out.print("Masukan nilai pertama Anda :"); 
       n1 = Nilai.readLine(); 
       System.out.print("Masukan nilai kedua Anda :"); 
       n2 = Nilai.readLine(); 
       System.out.print("Masukan nilai ketiga Anda :");
       n3 = Nilai.readLine(); 
}

catch (IOException e) {
       System.out.println("Kata yang anda masukan salah, silahkan coba lagi.");
}

       int nilai1; 
       int nilai2; 
       int nilai3;

       nilai1 = Integer.parseInt(n1); 
       nilai2 = Integer.parseInt(n2); 
       nilai3 = Integer.parseInt(n3);
       int  rumus=(nilai1 + nilai2 + nilai3) / 3; 
            System.out.println("Rata-rata nilai: " + rumus); 
       if 
           (rumus<=60) {System.out.println(":-(");
        }
        else {
            System.out.print(":-)");
        }
    }
}

