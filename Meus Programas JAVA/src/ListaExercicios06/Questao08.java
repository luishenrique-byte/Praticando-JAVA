package ListaExercicios06;

import java.util.Scanner;
public class Questao08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Insira o terceiro numero");
        int num3 = sc.nextInt();

        int menor, meio, maior;
        if (num1<=num2 && num1<=num3){
            menor = num1;
            if(num2<=num3){
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;        
            }
        } else if (num2<=num1 && num2<=num3) {
            menor = num2;
            if (num1<=3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1<=num2){
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }
        System.out.printf("A sequência em ordem crescente é: %d ; %d ; %d", menor,meio,maior);
    }
}
