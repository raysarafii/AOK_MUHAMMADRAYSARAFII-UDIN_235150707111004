/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aok;
import java.util.Scanner;
//Muhammad Raysa Rafii'udin
//235150707111004
public class AOK {

    /**
     * @Muhammad Raysa Rafii'udin
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         while (true) {
            System.out.println("Pilih jenis konversi:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda (0-6): ");
           int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    String binary = input.next();
                    int desimal = Integer.parseInt(binary, 2);
                    System.out.println("Hasil konversi ke desimal: " + desimal);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int dec = input.nextInt();
                    String bin = Integer.toBinaryString(dec);
                    System.out.println("Hasil konversi ke biner: " + bin);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    String binToHex = input.next();
                    int desimalkebiner = Integer.parseInt(binToHex, 2);
                    String heksa = Integer.toHexString(desimalkebiner);
                    System.out.println("Hasil konversi ke heksadesimal: " + heksa);
                    break;
                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String heksainput = input.next();
                    int desimaldariheksa = Integer.parseInt(heksainput, 16);
                    String heksakedesimal = Integer.toBinaryString(desimaldariheksa);
                    System.out.println("Hasil konversi ke biner: " + heksakedesimal);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimalkeheksa = input.nextInt();
                    String heksadesimal = Integer.toHexString(desimalkeheksa);
                    System.out.println("Hasil konversi ke heksadesimal: " + heksadesimal);
                    break;
                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String hex = input.next();
                    int desimaldarihex = Integer.parseInt(hex, 16);
                    System.out.println("Hasil konversi ke desimal: " + desimaldarihex);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Masukkan angka 0-6");
            }
        }
    }
}

   
