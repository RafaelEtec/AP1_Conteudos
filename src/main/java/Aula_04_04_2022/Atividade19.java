package Aula_04_04_2022;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Atividade19 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Quantas gramas de sorvete irá comprar?: ");
        double gramas = ent.nextDouble();
        
        System.out.println(retornoCompra(gramas));
    }
    
    public static String retornoCompra(double gramas) {
        String retornoCompra = "";
        double calc;
        if (gramas > 1000) {
            calc = gramas * 3;
            retornoCompra = gramas+"g * R$3.00 = "+calc;
        } else {
            calc = gramas * 3.50;
            retornoCompra = gramas+"g * R$3.50 = "+calc;
        }
        System.out.format("%.2f", calc);
        return retornoCompra;
    }
}