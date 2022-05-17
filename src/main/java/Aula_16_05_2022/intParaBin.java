package Aula_16_05_2022;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class intParaBin {
    
    public static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Número a ser convertido: ");
        String NBinario = intParaBinario(ent.nextInt());
        System.out.println(NBinario);
    }
    public static String intParaBinario(int N) {
        String NBinario = "";
        while (N > 0) {
            NBinario = N%2 + NBinario;
            N = N/2;
        }
        while (NBinario.length() < 8) {
            NBinario = "0" + NBinario;
        }
        return NBinario;
    }
}