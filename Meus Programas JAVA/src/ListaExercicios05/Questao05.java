package ListaExercicios05;

import java.util.Scanner;

public class Questao05 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a primeira palavra: ");
        String palavra1 = leitor.nextLine();

        System.out.println("Informe a segunda palavra: ");
        String palavra2=leitor.nextLine();

        System.out.println(palavra1.equals(palavra2));
    }
}