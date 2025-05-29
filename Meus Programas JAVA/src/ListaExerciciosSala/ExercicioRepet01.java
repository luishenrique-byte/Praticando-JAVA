package ListaExerciciosSala;
import java.util.Scanner;
public class ExercicioRepet01 {
//    Faça uma função que receba por parâmetro uma palavra e mostre na
//    tela a palavra na vertical.
//    Modelo Questão 1
//    Palavra = “Exemplo”
//    Saída:
//    E
//    x
//    e
//    m
//    p
//    l
//    o
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a palavra: ");
        String frase = sc.nextLine();

        int tamanhoFrase = frase.length();

        for (int i = 0; i<=tamanhoFrase; i++) {
            System.out.println(frase.charAt(i));
        }
    }
}
