package ListaExercicios08;

import java.util.Scanner;
public class Questao02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, informe a altura do retângulo: ");
        double altura = sc.nextDouble();
        System.out.println("Agora, informe a largura do retângulo: ");
        double largura = sc.nextDouble();

        double area = calcularAreaRetangulo(largura, altura);
        double perimetro = calcularPerimetroRetangulo(largura, altura);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("A área desse retângulo é: %f", area);
        System.out.printf("O perimêtro desse retângulo é: %f", perimetro);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");

    }
    static double calcularAreaRetangulo(double largura, double altura){
        double a = largura*altura;
        return a;
    }
    static double calcularPerimetroRetangulo(double largura, double altura){
        double p = 2*largura + 2*altura;
        return p;
    }
}