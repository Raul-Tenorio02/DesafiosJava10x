package NivelIntermediario.Desafio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Ninja listDeNinjas = new Ninja();
    Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        int opcao, indiceNinja;

        while(escolha != 4){
            System.out.println("\n=====MENU DE NINJAS=====");
            System.out.println("O que você quer fazer?");
            System.out.println("1. Listar personagens");
            System.out.println("2. Adicionar um personagem");
            System.out.println("3. Remover um personagem");
            System.out.println("4. Sair");
            System.out.print("Digite aqui: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\n=====LISTAGEM DE NINJAS=====");
                    System.out.println("O que você quer fazer?");
                    System.out.println("1. Listagem geral");
                    System.out.println("2. Listagem por índice");
                    System.out.print("Digite aqui: ");
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcao) {
                        case 1:
                            System.out.println("\n=====LISTAGEM GERAL=====");
                            listDeNinjas.listarNinjas();
                            break;
                        case 2:
                            System.out.println("\n=====LISTAGEM POR ÍNDICE=====");
                            System.out.print("Digite o índice do ninja: ");
                            indiceNinja = scanner.nextInt();
                            scanner.nextLine();
                            listDeNinjas.listarNinjas(indiceNinja);
                            break;
                        default:
                            System.out.println("\nEntrada inválida. Digite novamente.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n======ADICIONANDO NOVO NINJA======");
                    System.out.println("Em qual índice você deseja adicioná-lo?");
                    System.out.print("Digite aqui: ");
                    indiceNinja = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\nDigite o nome do ninja: ");
                    listDeNinjas.setNome(scanner.nextLine());
                    System.out.print("Digite a idade do ninja: ");
                    listDeNinjas.setIdade(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Digite a aldeia do ninja: ");
                    listDeNinjas.setAldeia(scanner.nextLine());
                    listDeNinjas.adicionarNinjas(indiceNinja, listDeNinjas.getNome(), listDeNinjas.getIdade(), listDeNinjas.getAldeia());
                    break;
                case 3:
                    System.out.println("\n======REMOVENDO NINJAS======");
                    System.out.println("Qual o índice do ninja a ser removido?");
                    System.out.print("Digite aqui: ");
                    indiceNinja = scanner.nextInt();
                    scanner.nextLine();
                    listDeNinjas.removerNinjas(indiceNinja);
                    break;
                case 4:
                    System.out.println("\nEncerrando...");
                    break;
                default:
                    System.out.println("\nEntrada inválida. Digite novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
