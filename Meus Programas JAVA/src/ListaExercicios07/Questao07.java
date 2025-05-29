package ListaExercicios07;

import java.util.Scanner;
public class Questao07 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int cont = 0, media,soma=0;
        while(true) {
            System.out.println("Informe a idade");
            int idade = sc.nextInt();

            if(idade < 0 || idade == 0){
                break;
            }
            cont++;
            soma+=idade;
        }
        media = soma/cont;
        System.out.printf("A quantidade de pessoas informadas é: %d%n",cont);
        System.out.printf("A media das idades informadas é: %d",media);
    }
}
