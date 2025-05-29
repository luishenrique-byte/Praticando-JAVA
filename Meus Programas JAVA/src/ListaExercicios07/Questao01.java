package ListaExercicios07;

import java.util.Scanner;
public class Questao01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        int num = sc.nextInt();

        int acum = 0;

        for(int i = 1; i <= num; i++ ){
            acum += Math.pow(i,2);
        }
        System.out.printf("A soma dos números de 1 a %d é igual a: %d",num,acum);
    }
}
