package ListaExercicios06;

import java.util.Scanner;
    public class Questao06 {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o coeficiente que está junto ao 'x²'");
            int a = sc.nextInt();
            System.out.println("Digite o coeficiente que esta junto ao 'x'");
            int b = sc.nextInt();
            System.out.println("Digite o coeficiente que sozinho, lembre se não estive escrito c = 0");
            int c = sc.nextInt();

            double delta = (Math.pow(b,2)) - 4*a*c;

            if (delta>0){
                double x1 = (-b + Math.sqrt(delta))/2*a;
                double x2 = (-b - Math.sqrt(delta))/2*a;
                System.out.printf("Essa equação de segundo grau possui duas raízes: %f e %f", x1, x2);
            } else if (delta == 0) {
                double x = -b/(2*a);
                System.out.printf("Essa equação de segundo grau possui apenas uma raiz: %f, x");
            } else {
                System.out.println("Essa equação NÃO possui raizes reais");
            }
        }
    }
