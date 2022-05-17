package Aula_18_04_2022;
import java.util.Scanner;

public class Cola {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        String nome = ent.next();
        
        char letra[] = separarTexto(nome);
        
        for (int pos = 0; pos < 10; pos++) {
            
        }
    }
    
    public static char[] separarTexto(String nome) {
        char[] letra = {};
        for (int pos = 0; pos < nome.length(); pos++) {
            letra[pos] = nome.charAt(pos);
        }
       
        return letra;
    }
}
