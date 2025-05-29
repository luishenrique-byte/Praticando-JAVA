package ListaExercicios09;

import java.util.Scanner;

//  11) Faça um programa que receba a quantidade e o valor dos produtos comprados por um
//  cliente numa venda e ao final gere uma nota de compra totalizando o valor a pagar.
//  Ex:
//          2 x 1,50 = 3,00
//          1 x 3,00 = 3,00
//  Total = 6
//  Devem ser usados 2 vetores de 100 posições: um para as quantidades e um para os valores. O
//  índice da quantidade deve corresponder ao índice do valor do ítem e o programa deve
//  apresentar o resultado quando o usuário atingir o 100o item informado ou informar um valor
//  menor ou igual a 0 na quantidade do item.
public class Questao11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[] qtde = new int[5];
        double[] valor = new double[5];
        double soma = 0;

        for(int i = 0; i< qtde.length; i++ ){
            System.out.printf("Por favor, informe a qtde desse produto: %d%n", i+1);
            qtde[i] = sc.nextInt();
            if(qtde[i]<=0){
                break;
            }
            System.out.println("Por favor, informe o valor desse produto: ");
            valor[i] = sc.nextDouble();
        }

        for (int x = 0; x<qtde.length; x++){
            if (qtde[x]<=0) break;
            double subtotal = qtde[x]*valor[x];
            System.out.printf("%d x %.2f = %.2f%n",qtde[x],valor[x],subtotal);
            soma += subtotal;
        }
        System.out.printf("Total = %.2f", soma);
        sc.close();
    }
}
