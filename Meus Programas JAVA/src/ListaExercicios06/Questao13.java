package ListaExercicios06;

import java.util.Scanner;

public class Questao13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a cor");
        String escolha = sc.nextLine();
        String cor = escolha.toLowerCase();

        switch(cor){
            case "vermelho":
                System.out.println("Se voce gosta de vermelho, deve Amar o Amor<3");
                break;
            case "verde":
                System.out.println("Se você gosta do verde experimente ir à floresta");
                break;
            case "azul":
                System.out.println("se você gosta de azul deveria ir ao mar mais vezes");
                break;
            case "amarelo":
                System.out.println("Se é o amarelo que atrai, busque correr atraz do Sol");
                break;
            case "preto":
                System.out.println("Se o preto te traz conforto, aproveite um pouquinho mais e durma no escuro");
                break;
            case "rosa":
                System.out.println("Acho que flores devem te agradar");
                break;
            default:
                System.out.println("Cor inválida");
        }
    }
}
