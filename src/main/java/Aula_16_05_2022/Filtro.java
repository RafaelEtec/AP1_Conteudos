package Aula_16_05_2022;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Filtro {
    
    public static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] numsFiltrados;
        int[] nums = entraValores();
        int filtro = numFiltro();
        numsFiltrados = maiorQue(nums, filtro);
    }
    
    public static int[] entraValores() {
        System.out.println("Qual o tamanho do seu Vetor?: ");
        int tamanhoVetor = ent.nextInt();
        int[] nums = new int[tamanhoVetor];
        
        return nums;
    }
    
    public static int[] maiorQue(int[] nums, int filtro) {
    
        return nums;
    }
    
    public static int numFiltro() {
        int filtro = 0;
        
        return filtro;
    }
}