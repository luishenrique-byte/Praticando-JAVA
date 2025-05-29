package ListaExercicios06;

import java.util.Scanner;
public class Questao04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o sexo('H' para homem e 'M' para mulher)");
        String sexo = sc.nextLine();

        System.out.println("Insira a altura(em metros)");
        double altura = sc.nextDouble();

        if (sexo.equalsIgnoreCase("H")) {
            double pesoIdeal = 72.7*altura - 58;
            System.out.printf("O peso ideal para um Homem de %.2f m é: %.2f KG", altura, pesoIdeal);
        } else if (sexo.equalsIgnoreCase("m")) {
            double pesoIdeal = 62.1*altura - 44.7;
            System.out.printf("O peso ideal para uma Mulher de %.2f m é: %.2f KG", altura, pesoIdeal);
        } else {
            System.out.print("Sexo invalido(Lembre-se ponha o sexo biológico");
        }
    }
}
