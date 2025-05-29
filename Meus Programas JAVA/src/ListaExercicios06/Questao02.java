package ListaExercicios06;

import java.util.Scanner;
public class Questao02 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um Número: ");
        int numero = leitor.nextInt();

        if (numero%2 == 0 && numero%3 ==0 && numero%5==0) {
            System.out.printf("O Número informado (%d) é PAR e mutiplo de 3 e 5", numero);
        } else if (numero%2 == 0 && numero%3 ==0) {
            System.out.printf("O Número informado (%d) é PAR e mutiplo de 3, mas NÃO de 5", numero);
        } else if (numero%2 == 0 && numero%5 ==0) {
            System.out.printf("O Número informado (%d) é PAR e mutiplo de 5, mas NÃO de 3", numero);
        } else if (numero%2 != 0 && numero%3 ==0 && numero%5 == 0) {
            System.out.printf("O Número informado (%d) é IMPAR e mutiplo de 5, mas NÃO de 3", numero);
        } else if (numero%2 != 0 && numero%3 ==0){
            System.out.printf("O Número informado (%d) é IMPAR e mutiplo de 3, mas NÃO de 5", numero);
        } else if (numero % 2 == 0 && numero % 3 != 0 && numero%5 != 0) {
            System.out.printf("O Número informado (%d) é apenas PAR", numero);
        } else {
            System.out.printf("O Número informado (%d) é apenas IMPAR", numero);
        }
    }
}
