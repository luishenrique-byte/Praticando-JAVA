package ListaExercicios08;

import java.util.Scanner;
public class Questao01 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int num;

            do {
                System.out.println("Por favor, informe uma número de 1 a 9: ");
                num = sc.nextInt();
                if (num >= 1 && num <= 9) {
                    System.out.println("+++++++++++++TABUADA SOMA++++++++++++");
                    tabuadaSoma(num);
                    System.out.println("********TABUADA MULTIPLICAÇÃO*******");
                    tabuadaMult(num);
                    numPrimo(num);
                    parOuImpar(num);
                    System.out.println("vvvvvvvvv QUADRADO DO NÚMERO vvvvvvvv");
                    double quad = quadrado(num);
                    System.out.println(quad);
                } else {
                    System.out.println("NÚMERO INVALIDO");
                }
            }while (num < 1 || num > 9);
    }
    static void tabuadaSoma(int num){
        for (int i = 0; i <= 10;i++){
            int soma = num + i;
            System.out.printf("%d + %d = %d",num,i,soma);
            System.out.println();
        }
    }
    static void tabuadaMult(int num){
        for (int i = 0; i<=10;i++){
            int multi = num * i;
            System.out.printf("%d x %d = %d",num,i,multi);
            System.out.println();
        }
    }
    static void numPrimo(int num){
        if (verificarPrimo(num)) {
            System.out.println("--------------------------");
            System.out.println("É UM NÚMERO PRIMO");
        } else {
            System.out.println("--------------------------");
            System.out.println("NÃO É PRIMO");
        }
    }
    public static boolean verificarPrimo(int num){
        if(num<=1){
            return false; // pois 0 e 1, por definição, não são primos
        }
        if(num>1){
            for (int i = 0; i >= Math.sqrt(num);i++){
                if (num%i==0){
                    return false; // pq se for divisivel por i, quer dizer que tbm não é primo
                }
            }
        }
    return true; // caso não caia em nenhuma delas ele vai ser primo
    }
    static void parOuImpar(int num){
        if(num%2==0){
            System.out.println("--------------------------");
            System.out.println("ELE É UM NÚMERO PAR");
        } else {
            System.out.println("-----------------------");
            System.out.println("ELE É UM NÚMERO IMPAR");
        }
    }
    static double quadrado(int num){
        double sqrt = Math.pow(num,2);
        return sqrt;
    }
}