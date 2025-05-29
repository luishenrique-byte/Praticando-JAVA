package ListaExercicios06;

import java.util.Scanner;
public class Questao09 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o ângulo: ");
        double angulo = sc.nextDouble();

        if (angulo>360) {
            angulo=angulo%360;
        }else if (angulo<0){
            angulo=(angulo%360)+360;
        }

        if (angulo<90 && angulo>0){
            System.out.println("Esse ângulo está no primeiro quadrante");
        } else if (angulo<180 && angulo>90){
            System.out.println("Esse ângulo está no segundo quadrante");
        } else if ( angulo<270 && angulo>180){
            System.out.println("Esse ângulo está no terceiro quadrante");
        } else if (angulo<360 && angulo>270) {
            System.out.println("Esse ângulo está no quarto quadrante");
        } else{
            System.out.println("Esse ângulo pertence a um dos eixo e não em um quadrante");
        }

    }
}
