package Aula_23_05_2022;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Simulado {
    
    public static Scanner ent = new Scanner(System.in);
    public static double valA, valB, valC;
    public static int tamanhoArray;
    public static boolean jaTemTamanhoArray = false;
    
    public static void main(String[] args) {
        escolheDesafio();
    }
    
    public static void escolheDesafio() {
        System.out.println(
                  "| (1) Implementar uma função que recebendo o valor de 'a', 'b' e 'c', calcule a fórmula de bhaskara.\n"
                + "| Ex: (1,12,-13) => [1,-13]\n|\n"
                + "| (2) Implementar uma função que recebendo um array de números inteiros e um número, retorne verdadeiro ou falso se o número existe nos elementos do array.\n"
                + "| Ex: ([1,2,3,4,5], 2) =>  true\n"
                + "|    ([1,2,3,4,5], 6) =>  false\n|\n"
                + "| (3) Implementar uma função que recebendo dois arrays de números inteiros, retorne um array com sua intersecção.\n"
                + "| Ex: ([1,2,3,4,5], [2,3,6,7,8]) => [2,3]\n"
                + "| Escolha o desafio: ");
        int desafio = ent.nextInt();
        
        switch (desafio) {
            case 1:
                desafio1();
                break;
            case 2:
                desafio2();
                break;
            case 3:
                desafio3();
                break;
        }
    }
    
    // /\ = b²-4*a*c
    
    public static void desafio1() {
        double[] valsFinal = descobreDelta();
        System.out.println("| ["+valsFinal[0]+","+valsFinal[1]+"] ");
    }
    
    public static double[] descobreDelta() {
        double[] vals = entraValores();
        double[] valsFinal = new double[2];
        
        double deltaPT1 = valB * valB;
        double deltaPT2 = (4 * valA) * valC;
        double delta = deltaPT1 - (deltaPT2);
        System.out.println("| Delta: " + delta);
        
        valsFinal = x1x2(delta);
        return valsFinal;
    }
    
    public static double[] x1x2(double delta) {
        double raizDelta = Math.sqrt(delta);
        
        double x1 = ((-valB) + raizDelta ) / (2 * valA);
        double x2 = ((-valB) - raizDelta ) / (2 * valA);
        
        double[] valsFinal = {x1, x2};
        return valsFinal;
    }
    
    public static double[] entraValores() {
        System.out.println("| Informe o valor de A: ");
        valA = ent.nextInt();
        System.out.println("| Informe o valor de B: ");
        valB = ent.nextInt();
        System.out.println("| Informe o valor de C: ");
        valC = ent.nextInt();
        double[] vals = {valA, valB, valC};
        return vals;
    }
    
    public static void desafio2() {
        System.out.println(verificaArray());
    }
    
    public static boolean verificaArray() {
        int[] vals = entraValoresArray();
        System.out.println("| Insira o valor a ser checado: ");
        int valTemOuNao = ent.nextInt();
        boolean temOuNao = false;
        for (int pos = 0; pos < vals.length; pos++) {
            if (vals[pos] == valTemOuNao) {
                temOuNao = true;
            }
        }
        return temOuNao;
    }
    
    public static int[] entraValoresArray() {
        if (jaTemTamanhoArray == false) {
            System.out.println("| Qual será o tamanho do array?: ");
            tamanhoArray = ent.nextInt();
            jaTemTamanhoArray = true;
        }
        int[] vals = new int[tamanhoArray];
        for (int pos = 0; pos < tamanhoArray; pos++) {
            System.out.println("| Insira o valor da posição "+pos+": ");
            vals[pos] = ent.nextInt();
        }
        return vals;
    }
    
    public static void desafio3() {
        int[] vals = interseccaoArrays();
        System.out.println();
        for (int pos = 0; pos < vals.length; pos++) {
            if (vals[pos] > 0) {
                System.out.print(vals[pos] + " ");
            }
        }
    }
    
    public static int[] interseccaoArrays() {
        System.out.println("| Valores para o Array 1: ");
        int[] array1 = entraValoresArray();
        System.out.println("| Valores para o Array 2: ");
        int[] array2 = entraValoresArray();
        int[] vals = checaArrays(array1, array2);
        return vals;
    }
    
    public static int[] checaArrays(int[] array1, int[] array2) {
        int pos = 0;
        int[] vals = new int[array1.length];
        for (int posArray1 = 0; posArray1 < array1.length; posArray1++) {
            for (int posArray2 = 0; posArray2 < array2.length; posArray2++) {
                if (array1[posArray1] == array2[posArray2]) {
                    vals[pos] = array1[posArray1];
                    pos++;
                }
            }
        }
        return vals;
    }
}