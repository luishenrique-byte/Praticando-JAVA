//  Trabalho LPA - UCSAL 2025.1
//  Prof: Fabio Sales
//  Tema: Lista de tarefas

//  Alunos:
//  Lucas dos Santos Batista 01
//  Luis Henrique Freitas Mendes 02
//  Arthur Jesus de OLiveira 03
//  Gabriel Miranda Cerqueira 04
//  Levi Ruan Silva Souza Batista 05
//  Claudio Emanuel dos Santos Teixeira 06
import java.util.Scanner;
public class ListaDeTarefa {
    static Scanner leitor = new Scanner(System.in);
    static String[][] lista; // matriz usada para as tarefas, virou uma variavel global da classe
    static int numMax;
    static int numPersonalizado;
    static int quantidadeDeTarefas;
    static int qtdeConcluidas = 0;
    static int qtdePendentes = 0;
    static String abaPersonalizada1;
    static String abaPersonalizada2;

    public static void main(String args[]) {
        int opcao;

        lista = tipoDeLista(); // não preciso informa as dimençoes, apenas atribuí à varial da classe

        do {

            exibirMenu();
            opcao = capturarOpcao();
            executarTarefa(opcao);

        } while (opcao != 8);
    }

    public static int capturarOpcao(){ // capturar e garantir que seja um número possível

        int selecionado;
        int tentativa = 1;
        do{
            if (tentativa > 1) {
                System.out.println("OPÇÃO INVÁLIDA");
                exibirMenu();
            }
            selecionado = leitor.nextInt();
            tentativa++;
        }while(selecionado < 1 || selecionado > 8);
        return selecionado;
    }

    public static String[][] tipoDeLista() { // definir se o usuario fará uma lista padrão ou personalizada

        numMax=0;
        numPersonalizado=0;

        System.out.println("--------------------------------------------");
        System.out.println("--------BEM-VINDO À LISTA DE TAREFA---------");
        System.out.println("--------------------------------------------");
        int tipo = capturarTipo();
        switch (tipo) {
            case 1:
                System.out.println();
                System.out.println("************************************");
                System.out.println("************Lista Padrão************");
                System.out.println("****************ABAS****************");
                System.out.println(" STATUS --- PRIORIDADE --- DESCRIÇÃO");
                System.out.println("************************************");
                System.out.println("   É NECESSÁRIO TER UM LIMITE DE    ");
                System.out.println("     TAREFAS PARA A SUA LISTA       ");
                System.out.println("************************************");
                System.out.println(" POR FAVOR, INFORME O NÚMERO MAXIMO ");
                System.out.println("             DE TAREFAS:             ");
                System.out.println();
                System.out.print("NÚMERO MÁXIMO = ");
                numMax = leitor.nextInt();
                numPersonalizado = 3;
                break;

            default:
                System.out.println();
                System.out.println("*******************************************************************************");
                System.out.println("*****************************Lista Personalizada*******************************");
                System.out.println("**************************************ABAS*************************************");
                System.out.println(" STATUS --- PRIORIDADE --- DESCRIÇÃO --- PERSONALIZADA (1) -- PERSONALIZADA (2)");
                System.out.println("*******************************************************************************");
                System.out.println("                       É NECESSÁRIO TER UM LIMITE DE                           ");
                System.out.println("                         TAREFAS PARA A SUA LISTA!                             ");
                System.out.println("*******************************************************************************");
                System.out.println(" POR FAVOR, INFORME O NÚMERO MAXIMO: ");
                System.out.println();
                System.out.print("NÚMERO MÁXIMO =                    ");
                numMax = leitor.nextInt();

                System.out.println("Agora,informe quantas abas vai querer, 1 ou 2 (DIGITE O NÚMERO):");
                int guardaAba = umOuDois();
                leitor.nextLine();
                if(guardaAba==1) {

                    numPersonalizado=4; // 4 pois a matriz tem 3 por padrão mais uma adicional.
                    System.out.println("Informe título da Aba personalizada");
                    abaPersonalizada1 = leitor.nextLine();

                }else {

                    numPersonalizado=5;// 5 pois a matriz tem 3 por padrão e mais duas adicionais.
                    System.out.println("Informe título da PRIMEIRA Aba personalizada");
                    abaPersonalizada1 = leitor.nextLine();
                    System.out.println("Informe título da SEGUNDA Aba personalizada");
                    abaPersonalizada2 = leitor.nextLine();

                }
                break;
        }
        String matrizComum[][] = new String[numMax][numPersonalizado];
        return matrizComum;
    }

    public static int umOuDois() {
        int aba;
        int tentativa = 1;
        do {

            if (tentativa > 1) {
                System.out.println("OPÇÃO INVÁLIDA");
                System.out.println("Por favor, escolha a quantidade de abas adicionais. Lembre-se no maximo duas: ");

            }
            aba = leitor.nextInt();
            tentativa++;
        }while(aba < 1 || aba >2);

        leitor.nextLine();
        return aba;
    }

    public static int capturarTipo(){ // CAPTURAR E GARANTIR QUE SEJA 1 OU 2
        int tipo;
        int tentativa = 1;
        System.out.println("Por favor, escolha seu tipo de lista: ");
        System.out.println("1 - Lista Padrão");
        System.out.println("2 - Lista Pesonalizada");
        do {

            if (tentativa > 1) {
                System.out.println("OPÇÃO INVÁLIDA");
                System.out.println("Por favor, escolha seu tipo de lista: ");
                System.out.println("1 - Lista Padrão");
                System.out.println("2 - Lista Pesonalizada");
            }
            tipo = leitor.nextInt();
            tentativa++;
        } while (tipo < 1 || tipo >2);

        leitor.nextLine();
        return tipo;
    }

    public static void exibirMenu(){
        System.out.println("------------------------------------------------");
        System.out.println("----------------------MENU----------------------");
        System.out.println("----------------LISTA DE TAREFAS----------------");
        System.out.println("------------------------------------------------");
        System.out.println(" Digite um número para acessar a tarefa desejada");
        System.out.println(" \uD83D\uDC40 1. Visualizar a lista.                         ");
        System.out.println(" ➕ 2. Adicionar itens a lista de tarefas.         ");
        System.out.println(" ➖ 3. Remover um item da lista.                   ");
        System.out.println(" ✅ 4. Marcar uma tarefa como concluida.           ");
        System.out.println(" \uD83D\uDDD1\uFE0F 5. Limpar lista.                               ");
        System.out.println(" \uD83D\uDCCA 6. Exibir estatísticas.                        ");
        System.out.println(" \uD83D\uDD0E 7. Filtrar lista.                              ");
        System.out.println(" ❌ 8. Sair                                        ");
        System.out.println("------------------------------------------------");
    }

    public static void executarTarefa(int opcao){
        switch(opcao) {
            case 1:

                visualizarTarefas(lista);

                break;

            case 2:

                adicionarTarefa(lista);

                break;

            case 3 :

                removerTarefa(lista);

                break;

            case 4:

                concluirTarefa(lista);

                break;

            case 5:

                limparLista(lista);

                break;

            case 6:

                exibirEstatistica();

                break;

            case 7:

                filtrarLista();

                break;

            default:
                System.out.print("Saindo....! ");
        }
    }

    public static void visualizarTarefas(String lista[][]){
        if (quantidadeDeTarefas == 0) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        if(numPersonalizado==3) {
            System.out.println("\n=== Lista de Tarefas ===");
            for (int i = 0; i < quantidadeDeTarefas; i++) {
                System.out.printf("%d. %s [%s]   %s\n", i + 1, lista[i][1], lista[i][2], lista[i][0]);

            }
        }

        if(numPersonalizado==4) {
            System.out.println("\n=== Lista de Tarefas ===");
            for (int i = 0; i < quantidadeDeTarefas; i++) {
                System.out.printf("%d. %s [%s]  %s  %s\n", i + 1, lista[i][1], lista[i][2], lista[i][0],lista[i][3]);
            }
        }

        if(numPersonalizado==5) {
            System.out.println("\n=== Lista de Tarefas ===");
            for (int i = 0; i < quantidadeDeTarefas; i++) {
                System.out.printf("%d. %s [%s]  %s  %s  %s\n", i + 1, lista[i][1], lista[i][2], lista[i][0],lista[i][3],lista[i][4]);

            }
        }
    }

    public static void adicionarTarefa(String lista[][]){
        leitor.nextLine();
        if(quantidadeDeTarefas>=numMax) {
            System.out.println("Lista cheia!");
            return;
        }
        if(numPersonalizado==3) {

            System.out.println("Digite a descrição da tarefa: ");
            String descricao = leitor.nextLine();

            System.out.println("Informe a prioridade (A - Alta, M - Média, B - Baixa): ");
            String prioridade = garantirPrioridade();

            lista[quantidadeDeTarefas][0] = descricao;
            lista[quantidadeDeTarefas][1] = "[ ]";
            lista[quantidadeDeTarefas][2] = prioridade;
            quantidadeDeTarefas++;

        }
        if(numPersonalizado==4) {

            System.out.print("Digite a descrição da tarefa: ");
            String descricao = leitor.nextLine();

            System.out.printf("Digite a descrição *PARA* %s:",abaPersonalizada1);
            String personalizada1= leitor.nextLine();

            System.out.print("Informe a prioridade (A - Alta, M - Média, B - Baixa): ");
            String prioridade = garantirPrioridade();

            lista[quantidadeDeTarefas][0] = descricao;
            lista[quantidadeDeTarefas][1] = "[ ]";
            lista[quantidadeDeTarefas][2] = prioridade;
            lista[quantidadeDeTarefas][3] = personalizada1;
            quantidadeDeTarefas++;

        }
        if(numPersonalizado==5) {

            System.out.print("Digite a descrição da tarefa: ");
            String descricao = leitor.nextLine();

            System.out.printf("Digite a descrição *PARA* %s:", abaPersonalizada1);
            String personalizada1= leitor.nextLine();

            System.out.printf("Digite a descrição *PARA* %s:",abaPersonalizada2);
            String personalizada2= leitor.nextLine();


            System.out.print("Informe a prioridade (A - Alta, M - Média, B - Baixa): ");
            String prioridade = garantirPrioridade();

            lista[quantidadeDeTarefas][0] = descricao;
            lista[quantidadeDeTarefas][1] = "[ ]";
            lista[quantidadeDeTarefas][2] = prioridade;
            lista[quantidadeDeTarefas][3] = personalizada1;
            lista[quantidadeDeTarefas][4] = personalizada2;
            quantidadeDeTarefas++;

        }
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public static String garantirPrioridade (){
        String opcao;
        int tentativa = 1;

        if (leitor.hasNextLine()) leitor.nextLine();

        do {
            opcao = leitor.nextLine();
            if (tentativa > 1) {
                System.out.println("Opção Inválida!");
                System.out.println("Digite uma das opções abaixo:");
                System.out.println("A - Alta");
                System.out.println("M - Média");
                System.out.println("B - Baixa");

            }
            tentativa++;
        } while (!opcao.equalsIgnoreCase("A") && !opcao.equalsIgnoreCase("B") && !opcao.equalsIgnoreCase("M"));

        return opcao.toUpperCase();
    }

    public static void removerTarefa(String lista[][]){
        visualizarTarefas(lista);

        if (quantidadeDeTarefas == 0) { // CASO NÃO HAJA TAREFA, ASSIM PULA TODO COMANDO DESSA FUNÇÃO
            return;
        }

        System.out.print("Informe o número da tarefa a remover: ");
        int indice = leitor.nextInt() - 1;

        leitor.nextLine();

        if (indice >= 0 && indice < quantidadeDeTarefas) {
            for (int i = indice; i < quantidadeDeTarefas - 1; i++) {
                lista[i] = lista[i + 1];
            }
            lista[quantidadeDeTarefas - 1] = new String[numPersonalizado];
            quantidadeDeTarefas--;
            System.out.println("Tarefa removida!");
        } else {
            System.out.println("Número inválido!");
        }
    }

    public static void concluirTarefa(String lista[][]){
        visualizarTarefas(lista);

        if (quantidadeDeTarefas == 0) { // CASO NÃO HAJA TAREFA, ASSIM PULA TODO COMANDO DESSA FUNÇÃO
            return;
        }

        int tentativa = 1;
        int indiceTarefa;
        do {
            if (tentativa >1){
                System.out.println("A TAREFA SELECIONADO NÃO EXISTE");
                System.out.println("================================");
            }
            System.out.println("Informe o número da tarefa a ser marcada como concluída:");
            indiceTarefa = leitor.nextInt() - 1;

            leitor.nextLine();


            tentativa++;
        } while(indiceTarefa < 0 || indiceTarefa >= quantidadeDeTarefas);


        if (lista[indiceTarefa][1].equals("[x]")) {

            System.out.println("TAREFA JÁ CONCLUÍDA");
            return;

        } else {
            lista[indiceTarefa][1] = "[x]";
            System.out.println("Tarefa marcada como concluída!");
        }
    }

    public static void limparLista(String lista[][]){
        visualizarTarefas(lista);

        if (quantidadeDeTarefas == 0) { // CASO NÃO HAJA TAREFA, ASSIM PULA TODO COMANDO DESSA FUNÇÃO
            return;
        }

        int escolha;
        do { // PEDINDO A ESCOLHA E GARANTINDO QUE SEJA UM NÚMERO VALIDO
            System.out.println("ESCOLHA OPÇÃO: ");
            System.out.println("[1] LIMPAR TODAS AS CONCLUÍDAS ");
            System.out.println("[2] LIMPAR TODAS AS PENDENTES ");
            System.out.println("[3] LIMPAR TODA A LISTA ");
            escolha = leitor.nextInt();

            leitor.nextLine();

            if(escolha < 1 || escolha > 3){
                System.out.println("NÚMERO INVALIDO");
                System.out.println("POR FAVOR ESCOLHA UMA OPÇÃO( 1 , 2 OU 3 )");
            }
        } while (escolha < 1 || escolha > 3);

        switch (escolha){
            case 1:

                for (int i = 0; i < quantidadeDeTarefas; i++) {
                    if (lista[i][1].equals("[x]")) {

                        for (int j = i; j < quantidadeDeTarefas - 1; j++) {

                            lista[j] = lista[j + 1];
                        }

                        lista[quantidadeDeTarefas - 1] = new String[numPersonalizado];
                        quantidadeDeTarefas--;
                        i--;
                    }
                }
                System.out.println("Tarefas concluídas removidas!");
                break;
            case 2:

                for (int i = 0; i < quantidadeDeTarefas; i++) {
                    if (lista[i][1].equals("[ ]")) {
                        for (int j = i; j < quantidadeDeTarefas - 1; j++) {

                            lista[j] = lista[j + 1];
                        }

                        lista[quantidadeDeTarefas - 1] = new String[numPersonalizado];
                        quantidadeDeTarefas--;
                        i--;
                    }
                }
                System.out.println("Tarefas pendentes removidas!");

                break;
            case 3:
                quantidadeDeTarefas = 0;
                System.out.println("Lista limpa!");
                break;
        }
    }

    public static void exibirEstatistica() {
        for (int i = 0; i < quantidadeDeTarefas; i++) {
            if (lista[i][1].equals("[x]")) {
                qtdeConcluidas ++;
            }
        }
        qtdePendentes = quantidadeDeTarefas - qtdeConcluidas;

        double percentual;
        if(quantidadeDeTarefas>0){

            percentual = (qtdeConcluidas*100.0)/quantidadeDeTarefas;

        } else {

            percentual = 0;

        }
        System.out.println("=====================================");
        System.out.println("             ESTATÍSTICAS            ");
        System.out.println("=====================================");
        System.out.printf("Total de Tarefas:                    %d%n", quantidadeDeTarefas);
        System.out.printf("Total de Concluídas:                 %d%n", qtdeConcluidas);
        System.out.printf("Total de Pendentes:                  %d%n", qtdePendentes);
        System.out.printf("Total de Percentual Concluído:   %.2f%n", percentual);
        qtdePendentes = 0;
        qtdeConcluidas = 0;
    }

    public static void filtrarLista(){

        boolean algumaFoiExibida = false;

        if(quantidadeDeTarefas==0){
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        int filtro;
        int tentativa = 1;
        do{
            if (tentativa>1){
                System.out.println("OPÇÃO NÃO EXISTENTE");
            }
            System.out.println("Escolha o filtro desejado:");
            System.out.println("[1] Exibir apenas tarefas CONCLUÍDAS");
            System.out.println("[2] Exibir apenas tarefas PENDENTES");
            System.out.println("[3] Exibir TODAS as tarefas");
            filtro = leitor.nextInt();
            leitor.nextLine();

            tentativa++;

        }while (filtro < 1 || filtro > 3);

        System.out.println("\n=== Lista de Tarefas ===");

        for (int i = 0; i < quantidadeDeTarefas; i++) {
            String status = lista[i][1];
            boolean exibir = false;

            switch (filtro) {
                case 1:

                    exibir = status.equals("[x]");

                    break;
                case 2:

                    exibir = status.equals("[ ]");

                    break;
                case 3:

                    exibir = true;

                    break;
            }
            if(exibir) {
                algumaFoiExibida = true;
                if (numPersonalizado == 3) {
                    System.out.printf("%d. %s [%s]   %s\n", i + 1, lista[i][1], lista[i][2], lista[i][0]);
                }else if (numPersonalizado == 4) {
                    System.out.printf("%d. %s [%s]  %s  %s\n", i + 1, lista[i][1], lista[i][2], lista[i][0], lista[i][3]);
                }else if (numPersonalizado == 5) {
                    System.out.printf("%d. %s [%s]  %s  %s  %s\n", i + 1, lista[i][1], lista[i][2], lista[i][0], lista[i][3], lista[i][4]);
                }
            }
        }
        if(!algumaFoiExibida){
            System.out.println("NENHUMA TAREFA ENCONTRADA COM ESSE FILTRO");
        }
    }
}