package ListaExercicios08;

import java.util.Scanner;

public class Questao03 {
    Scanner sc = new Scanner(System.in);
    public void iniciarConversor () {
        int opcao;
        do {
            mostrarMenu();
            opcao = escolherOpcao();
            executarOpcao(opcao);
        }while (opcao != 7);
    }
    public void mostrarMenu() { // mostrando o menu
        System.out.println("***********************************************");
        System.out.println("********** BEM VINDO AO CONVERSOR *************");
        System.out.println("***********************************************");
        System.out.println("********** INFORME A OPÇÃO DESEJADA ***********");
        System.out.println("***********************************************");
        System.out.println("* 1 – Converter de celsius para fahrenheit    *");
        System.out.println("* 2 – Converter de fahrenheit para celsius    *");
        System.out.println("* 3 – Converter de centímetros para polegadas *");
        System.out.println("* 4 – Converter de polegadas para centímetros *");
        System.out.println("* 5 – Converter de kilometros para milhas     *");
        System.out.println("* 6 – Converter de milhas para kilometros     *");
        System.out.println("* 7 – SAIR                                    *");
        System.out.println("***********************************************");
    }
    public int escolherOpcao(){ // aqui preciso garantir que escolha de 1 a 7
        int selecionado;
        do {
            System.out.println("Por favor, informe um número de 1 -> 7: ");
            selecionado = sc.nextInt();

            if (selecionado < 1 || selecionado >7){
                System.out.println("OPÇÃO INVÁLIDA");
                mostrarMenu();
            }
        } while(selecionado < 1 || selecionado >7);
        return selecionado;
    }
    public void executarOpcao(int opcao) { // fazendo que o valor sja convertido
        double valorConverter;
        double valorFinal;
        switch (opcao){
            case 1:
                valorConverter = capturarValor();
                valorFinal = converterCeulciusParaF(valorConverter);
                exibirResultado(opcao,valorConverter,valorFinal);
                break;
            case 2:
                valorConverter = capturarValor();
                valorFinal = converterFahrenheitParaC(valorConverter);
                exibirResultado(opcao,valorConverter,valorFinal);
                break;
            case 3:
                valorConverter = capturarValor();
                valorFinal = converterCentimetrosParaP(valorConverter);
                exibirResultado(opcao,valorConverter,valorFinal);

                break;
            case 4:
                valorConverter = capturarValor();
                valorFinal = converterPolegadasParaC(valorConverter);
                exibirResultado(opcao,valorConverter,valorFinal);
                break;
            case 5:
                valorConverter = capturarValor();
                valorFinal = converterKilometrosParaM(valorConverter);
                exibirResultado(opcao,valorConverter,valorFinal);
                break;
            case 6:
                valorConverter = capturarValor();
                valorFinal = converterMilharParaK(valorConverter);
                exibirResultado(opcao,valorConverter,valorFinal);
                break;
            default:
                System.out.println("SAINDO.... ATÉ MAIS VEZES!!!");
                break;
        }
    }
    public double capturarValor() { // fazendo o valor se informado
        System.out.println("EXECUTANDO CONVERSOR...");
        System.out.println("Por favor, informe o Valor a ser convertido: ");
        double valor = sc.nextDouble();
        return valor;
    }
    public double converterCeulciusParaF(double valorConverter){
        double valorFinal = ((valorConverter * 9)/5) + 32;
        return valorFinal;
    }
    public double converterFahrenheitParaC(double valorConverter){
        double valorFinal = (valorConverter - 32) * 5/9;
        return valorFinal;
    }
    public double converterCentimetrosParaP(double valorConverter){
        double valorFinal = valorConverter *2.54;
        return valorFinal;
    }
    public double converterPolegadasParaC(double valorConverter){
        double valorFinal = valorConverter * 0.3937;
        return valorFinal;
    }
    public double converterKilometrosParaM(double valorConverter){
        double valorFinal = valorConverter * 0.62137;
        return valorFinal;
    }
    public double converterMilharParaK(double valorConverter){
        double valorFinal = valorConverter * 1.6093;
        return valorFinal;
    }
    public void exibirResultado(int opcao, double valorConverter, double valorFinal){
        switch (opcao){
            case 1:
                System.out.printf("%f gruas Celcius convertido para Fahrenheit é: %f%n",valorConverter,valorFinal);

                break;
            case 2:
                System.out.printf("%f Fahrenheit convertido para Celcius é: %f%n",valorConverter,valorFinal);
                break;
            case 3:
                System.out.printf("%f Centímetros convertido para Polegadas é: %f%n",valorConverter,valorFinal);
                break;
            case 4:
                System.out.printf("%f Polegadas convertido para Centímetros é: %f%n",valorConverter,valorFinal);
                break;
            case 5:
                System.out.printf("%f Quilômetros convertido para Milhas é: %f%n",valorConverter,valorFinal);
                break;
            case 6:
                System.out.printf("%f Milhas convertido para Quilômetros é: %f%n",valorConverter,valorFinal);
                break;
        }
    }
}