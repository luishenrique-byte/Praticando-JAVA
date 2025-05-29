package ListaExerciciosSala;
import java.util.Scanner;
public class ExercicioCxEletro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("");
        System.out.println("Bem-vindo ao Banco do Dinheiro");
        System.out.println("");

        boolean controladorLoop = true;
        float saldo = 0;
        while(controladorLoop)  {
            System.out.println("==============================");
            System.out.println("Por favor, escolha uma ação");
            System.out.println("1: Depositar.");
            System.out.println("2: Sacar.");
            System.out.println("3: Consultar saldo.");
            System.out.println("4: Sair.");
            System.out.println("==============================");
            System.out.print("Número da ação: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:

                    System.out.println("Por favor, insira o valor a ser depositado: ");
                    float depositado = sc.nextFloat();

                    if(depositado>= 0){
                        saldo += depositado;

                        System.out.println("DEPÓSITO CONCLUÍDO");
                    } else {
                        System.out.println("Não é possível depositar um valor negativo!");
                    }

                    break;
                case 2:

                    System.out.println("Por favor, insira o valor a ser sacado: ");
                    float sacado = sc.nextFloat();

                    if (sacado >=0){
                        if (sacado <= saldo){

                            saldo -= sacado;
                            System.out.println("SAQUE CONCLUÍDO");
                        } else {
                            System.out.println("SALDO INSUFICIENTE");
                        }
                    } else {
                        System.out.println("Não é possivel sacar um valor negativo!");
                    }

                    break;
                case 3:
                    System.out.println("==============================");
                    System.out.printf("Saldo da Conta: %.2f%n",saldo);
                    break;
                case 4:
                    System.out.println("==============================");
                    System.out.println("Você tem certeza que deseja sair? (1) SIM | (2) NÃO");
                    int opcao = sc.nextInt();

                    if (opcao==1){
                        System.out.println("Obrigado por nos escolher, volte sempre!");
                        System.out.println("=================FIM===================");
                        controladorLoop = false;
                    }
                    break;
                default:
                    System.out.println("OPÇÃO NÃO RECONHECIDA");
            }
        }
        sc.close();
    }
}