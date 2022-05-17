package Aula_16_05_2022;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class converteTexto {
    
    public static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Informe o texto a ser transformado em Binário: ");
        String[] txtBinario = converterBinario(ent.nextLine());
        System.out.println(txtBinario);
    }
    
    public static void printArray(String[] arr) {
        for (String item : arr) {
            System.out.print(item + " ");
        }
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
    
    public static String[] converterBinario(String texto) {
        String[] binarios = new String[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            int ascii = letra;
            binarios[i] = intParaBinario(ascii);    
        }
        return binarios;
    }
}