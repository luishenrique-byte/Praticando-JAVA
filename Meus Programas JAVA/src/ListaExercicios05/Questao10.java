package ListaExercicios05;

import java.util.Scanner;

public class Questao10{
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a palavra: ");
        String palavra1 = leitor.nextLine();

        System.out.println(palavra1.charAt(0));
        System.out.println(palavra1.charAt(1));
        System.out.println(palavra1.charAt(2));
    }
}
