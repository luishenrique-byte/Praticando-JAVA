package ListaExercicios06;

import java.util.Scanner;
public class Questao10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua nota no trabalho do Labóratorio: ");
        float lab = sc.nextFloat();
        System.out.println("Informe sua nota na Avaliação Semestral: ");
        float avalia = sc.nextFloat();
        System.out.println("Informe sua nota no Exame Final: ");
        float exame = sc.nextFloat();

        float nota = ((lab * 2)+(avalia*3)+(exame*5))/10;
        Object conceito;

        if (nota<10) {
            if (nota <= 10 && nota >= 8) {
                conceito = "A";
            } else if (nota < 8 && nota >= 7) {
                conceito = "B";
            } else if (nota < 7 && nota >= 6) {
                conceito = "C";
            } else if (nota < 6 && nota >= 5) {
                conceito = "D";
            } else {
                conceito = "E";
            }
            System.out.printf("Sua média final foi %.1f e conceito %s", nota, conceito);
        }else{
            System.out.printf("Você informou alguma nota errada");
        }
    }
}
