//created by 21343058_Muhammad Farel Fahlevi

package Tugas;

import javax.swing.JOptionPane;

public class Tugas1b {
public static void main(String [] args) {
    String n1 = JOptionPane.showInputDialog("Masukkan nilai pertama anda :");
    String n2 = JOptionPane.showInputDialog("Masukkan nilai kedua anda :");
    String n3 = JOptionPane.showInputDialog("Masukkan nilai ketiga anda :");

    int nilai1 = Integer.parseInt(n1); 
    int nilai2 = Integer.parseInt(n2); 
    int nilai3 = Integer.parseInt(n3);
    
    int rumus=(nilai1 + nilai2 + nilai3) / 3; 
        
if 
    (rumus <= 60) {
        String msg1 = ":-(";
        JOptionPane.showMessageDialog(null, msg1);
 }
 else {
    String msg2 = ":-)";
    JOptionPane.showMessageDialog(null, msg2);
        }
    }    
}
