package Aula_11_04_2022;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class desafios {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n = 0;
        System.out.println(
                "Desafios: \n"
              + "<1> Implementar uma função que escreva no terminal os números naturais de 1 até N.\n"
                        + "<2> Implementar uma função que escreva no terminal os números naturais pares de 1 até N.\n"
                        + "<3> Implementar uma função que escreva no terminal os números naturais ímpares de 1 até N.\n"
                        + "<4> Implementar uma função que escreva no terminal os números naturais de 1 até N de forma decrescente.\n"
                        + "<5> Implementar uma função que escreva no terminal os números naturais pares de 1 até N de forma decrescente.\n"
                        + "<6> Implementar uma função que escreva no terminal os números naturais ímpares de 1 até N de forma decrescente.\n");
        System.out.println("Escolha o desafio: ");
        int ativ = ent.nextInt();

        switch (ativ) {
            case 1:
                System.out.println("Número a ser usado: ");
             n = ent.nextInt();
                ateNum(n);
                break;
            case 2:
                System.out.println("Número a ser usado: ");
            n = ent.nextInt();
                numsPar(n);
                break;
            case 3:
                System.out.println("Número a ser usado: ");
            n = ent.nextInt();
                numsImpar(n);
                break;
            case 4:
                System.out.println("Número a ser usado: ");
            n = ent.nextInt();
                decrescente(n);
                break;
            case 5:
                System.out.println("Número a ser usado: ");
            n = ent.nextInt();
                ateDecrescentePar(n);
                break;
            case 6:
                System.out.println("Número a ser usado: ");
            n = ent.nextInt();
                ateDecrescenteImpar(n);
                break;
            case 7:
                quadrilatero();
                break;
            case 8:
                triangulo();
                break;
            default:
                System.out.println("erro!");
                break;
        }
        
    }
    
    /**
    public static void parOuImpar(int n) {
        while (n <= 50) {
            if (n%2 == 0) {
                System.out.println(n+" - par");
            } else {
                System.out.println(n+" - ímpar");
            }
            n++;
        }
    }
    **/
    
    public static void ateNum(int n) {
        int inicio = 1;
        while (inicio <= n) {
            System.out.println(inicio);
            inicio++;
        }
    }
    
    public static void numsPar(int n) {
        int inicio = 1;
        while (inicio <= n) {
            if (inicio%2 == 0) {
                System.out.println(inicio);
            }
            inicio++;
        }
    }
    
    public static void numsImpar(int n) {
        int inicio = 1;
        while (inicio <= n) {
            if (inicio%2 == 1) {
                System.out.println(inicio);
            }
            inicio++;
        }
    }
    
    public static void decrescente(int n) {
        int inicio = 1;
        while (inicio <= n) {
            System.out.println(n);
            n--;
        }
    }
    
    public static void ateDecrescentePar(int n) {
        int inicio = 1;
        while (inicio <= n) {
            if (n%2 == 0) {
                System.out.println(n);
            }
            n--;
        }
    }
    
    public static void ateDecrescenteImpar(int n) {
        int inicio = 1;
        while (inicio <= n) {
            if (n%2 == 1) {
                System.out.println(n);
            }
            n--;
        }
    }
    
    public static void quadrilatero() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Número de colunas");
        int linhas = ent.nextInt();
        System.out.println("Número de linhas");
        int colunas = ent.nextInt();
        
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }
    
    public static void triangulo() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Número de colunas");
        int linhas = ent.nextInt();
        int colunas = linhas;
        
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}