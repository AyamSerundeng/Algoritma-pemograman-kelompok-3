/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author HYPE AMD
 */
public class BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM HITUNG BOLA ===");
        System.out.println();
        
        // Minta input jari-jari
        System.out.print("Masukkan jari-jari bola (cm) : ");
        double r = input.nextDouble();
        
        // Hitung volume = 4/3 × π × r³
        double volume = (4.0 / 3) * 3.14159 * r * r * r;
        
        // Hitung luas permukaan = 4 × π × r²
        double luasPermukaan = 4 * 3.14159 * r * r;
        
        // Tampilkan hasil
        System.out.println("\nHasil perhitungan:");
        System.out.println("-------------------");
        System.out.printf("Jari-jari bola       = %.2f cm\n", r);
        System.out.printf("Volume bola          = %.2f cm³\n", volume);
        System.out.printf("Luas permukaan bola  = %.2f cm²\n", luasPermukaan);
        
        input.close();
    }
}
