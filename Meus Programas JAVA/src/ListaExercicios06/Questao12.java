package ListaExercicios06;

import java.util.Scanner;
public class Questao12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua nota(apenas o valor inteiro ou 0.1)");
        int nota = sc.nextInt();

        switch (nota){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 6:
            case 5:
                System.out.println("C");
                break;
            case 4:
            case 3:
                System.out.println("D");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("E");
                break;
            default:
                System.out.println("Nota inválida");
        }
    }
}
