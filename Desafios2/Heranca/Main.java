package NivelIntermediario.Desafios2.Heranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int index = 0;

        System.out.print("Digite um limite de tamanho para a listagem de ninjas: ");
        int limite = scanner.nextInt();
        scanner.nextLine();
        Ninja[] ninja = new Ninja[limite];

        while (escolha != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    if (index == ninja.length) {
                        System.out.println("Cabou o espaço :(");
                    } else {
                        System.out.println("\nSelecione o tipo de ninja que voce deseja cadastrar: ");
                        System.out.println("1. Comum");
                        System.out.println("2. Uchiha");
                        System.out.print("Escolha uma opção: ");
                        int escolhaTipo = scanner.nextInt();
                        scanner.nextLine();

                            switch (escolhaTipo) {
                                case 1:
                                    Ninja novoNinja = new Ninja();
                                    System.out.println("\n=====Cadastro de Ninja====");
                                    System.out.print("Nome: ");
                                    novoNinja.nome = scanner.nextLine();
                                    System.out.print("Idade: ");
                                    novoNinja.idade = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Missao: ");
                                    novoNinja.missao = scanner.nextLine();
                                    System.out.print("Dificuldade da Missao: ");
                                    novoNinja.nivelDificuldade = scanner.nextLine();
                                    System.out.print("Status da Missao: ");
                                    novoNinja.statusMissao = scanner.nextLine();
                                    ninja[index] = novoNinja;
                                    index++;
                                    break;
                                case 2:
                                    Uchiha novoUchiha = new Uchiha();
                                    System.out.println("\n=====Cadastro de Ninja====");
                                    System.out.print("Nome: ");
                                    novoUchiha.nome = scanner.nextLine();
                                    System.out.print("Idade: ");
                                    novoUchiha.idade = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Missao: ");
                                    novoUchiha.missao = scanner.nextLine();
                                    System.out.print("Dificuldade da Missao: ");
                                    novoUchiha.nivelDificuldade = scanner.nextLine();
                                    System.out.print("Status da Missao: ");
                                    novoUchiha.statusMissao = scanner.nextLine();
                                    System.out.print("Habilidade especial: ");
                                    novoUchiha.habilidadeEspecial = scanner.nextLine();
                                    ninja[index] = novoUchiha;
                                    index++;
                                    break;
                            }
                    }
                    break;
                case 2:
                    System.out.println("\n=====Ninjas cadastrados=====");
                    for (int i = 0; i < ninja.length; i++) {
                        if (ninja[i] !=null)
                            ninja[i].mostrarInformacoes();
                    }
                    break;
                case 3:
                    System.out.println("Xi, já vai? Até logo!");
                    break;
                default:
                    System.out.println("Entrada invalida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
