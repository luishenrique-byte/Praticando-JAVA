package ListaExerciciosSala;

import java.util.Scanner;

public class Lista2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        while(true){

            System.out.println("Informe qual operação deseja( + , - , * ou /): ");
            String operacao = sc.nextLine();

            switch (operacao) {
                case "+":
                    System.out.println("OPERAÇÃO - ADIÇÃO");

                    System.out.print("Informe o primeiro número: ");
                    float num1 = sc.nextInt();
                    System.out.println("Informe o segundo número: ");
                    float num2 = sc.nextInt();

                    float soma = num1 +num2;
                    System.out.printf("%f + %f = %f", num1,num2,soma);
                    System.out.println("");
                    break;

                case "-":
                    System.out.println("OPERAÇÃO - SUBTRAÇÃO");

                    System.out.print("Informe o primeiro número: ");
                    num1 = sc.nextInt();
                    System.out.println("Informe o segundo número: ");
                    num2 = sc.nextInt();

                    float subtracao = num1-num2;
                    System.out.printf("%f - %f = %f", num1,num2,subtracao);
                    System.out.println("");
                    break;

                case "*":
                    System.out.println("OPERAÇÃO - MULTIPLICAÇÃO");

                    System.out.print("Informe o primeiro número: ");
                    num1 = sc.nextInt();
                    System.out.println("Informe o segundo número: ");
                    num2 = sc.nextInt();

                    float multi = num1*num2;
                    System.out.printf("%f * %f = %f", num1,num2,multi);
                    System.out.println("");
                    break;

                case "/":
                    System.out.println("OPERAÇÃO - DIVISÃO");
                    System.out.print("Informe o primeiro número: ");
                    num1 = sc.nextInt();
                    System.out.println("Informe o segundo número: ");
                    num2 = sc.nextInt();

                    if (num2 != 0){
                        float div = num1/num2;
                        System.out.printf("%f / %f = %f", num1,num2,div);
                        System.out.println("");
                    } else {
                        System.out.println("Não é póssivel dividir por ZERO!!!");
                    }
                    break;
                default:
                    System.out.println("OPERAÇÃO INVÁLIDA");
                    break;
            }

            System.out.println("Deseja fazer outra operação? (1) SIM / (2) NÃO");
            int outra = sc.nextInt();

            if (outra == 2) {
                break;
            }
            sc.nextLine();
        }
    }
}

