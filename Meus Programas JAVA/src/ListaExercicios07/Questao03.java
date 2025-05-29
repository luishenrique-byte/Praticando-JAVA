package ListaExercicios07;

import java.util.Scanner;
public class Questao03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Por favor Informe um número inteiro para repretar a quantidade de valores informados: ");
    int limite = sc.nextInt();

    int soma = 0,qtdeUso=0;
    float media = 0;

    for(int i = 1; i<=limite; i++){
        System.out.println("Agora, por favor informe um número inteiro: ");
        int num = sc.nextInt();
        if (num>0){
            qtdeUso++;
        } else {

            continue;
        }
        soma+=num;
    }

    media = soma/qtdeUso;
    System.out.printf("A soma total dos números é: %d",soma);
    System.out.printf("A quantidade de números considerados foi: %d", qtdeUso);
    System.out.printf("A media entre os números informados foi: %f", media);

    }
}
