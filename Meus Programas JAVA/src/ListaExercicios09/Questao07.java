package ListaExercicios09;//  7) Faça um programa que preencha um vetor de 20 posições com valores recebidos pelo teclado
//  de forma que os ímpares fiquem nas primeiras 10 posições e os pares nas últimas 10 posições
//  do vetor. Caso o número de elementos de um tipo seja informado em quantidade maior que 10,
//  os excessos devem ser “descartados”. Por exemplo, se foram informados 7 ímpares e 13 pares,
//  os 3 valores pares devem ser descartados e apenas as 7 primeiras posições do vetor serão
//  preenchidas com os números ímpares. Depois percorra o vetor apresentando os elementos em
//  tela.

import java.util.Scanner;

public class Questao07 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int numeros[] = new int[20];
        int numImpar = 0;   // posicões para os números impares
        int numPar = 10;    // posicões para os números pares
        int contador = 0;   // para não ultrapassar o limite do vetor e dar erro

        while (contador !=20 && (numImpar < 10 || numPar < 20)){
            System.out.println("informe um número inteiro para preencher o vetor: ");
            int numAlimenta = sc.nextInt();

            if (numAlimenta % 2 == 0){ // testando se é par
                if (numPar<20) {
                    numeros[numPar] = numAlimenta;
                    numPar++;
                }else {
                    System.out.println("NÚMERO DESCARTADO - LIMETE 10 NÚMEROS PARES");
                }
            } else { // testando se o numero é impar
                if (numImpar<10){
                    numeros[numImpar] = numAlimenta;
                    numImpar++;
                } else {
                    System.out.println("NÚMERO DESCARTADO - LIMETE 10 NÚMEROS IMPARES");
                }
            }
            contador++;
        }
        System.out.println("---------EXIBINDO VETOR--------"); 
        for (int i = 0; i<numeros.length;i++) {
            
            System.out.print(numeros[i]+ " ");
        }
    }
}
