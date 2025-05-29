package ListaExercicios07;

import java.util.Scanner;
public class Questao06 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        int num = sc.nextInt();

        String asteristico = "";
        for(int i = 1; i <= num; i++){
            asteristico+="*";
            System.out.println(asteristico);
        }
    }
}
