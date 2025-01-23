package NivelBasico.Desafio2;

import java.util.Scanner;

public class CadastrandoNinjas {
    public static void main(String[] args) {
        //desafio 2


        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int index = 0;
        int limite;
        System.out.println("Quantos ninjas você deseja cadastrar?");
        limite = scanner.nextInt();
        String[] ninja = new String[limite];

        while (escolha != 3){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    if (index == ninja.length){
                        System.out.println("Cabou o espaço :(");
                    } else {
                        System.out.print("Cadastre um novo ninja: ");
                        String novoNinja = scanner.nextLine();
                        ninja[index] = novoNinja;
                        index++;
                    }
                    break;
                case 2:
                    System.out.println("Ninjas cadastrados: ");
                    for (int i = 0; i < ninja.length; i++) {
                        System.out.println(ninja[i]);
                    }
                    break;
                case 3:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Nada a ve o que voce ta fazendo ai. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
