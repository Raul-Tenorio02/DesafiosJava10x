package NivelIntermediario.Desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NinjaBasico Naruto = new NinjaBasico("Naruto Uzumaki", 17, "Rasengan");
        TipoHabilidade Rasengan = TipoHabilidade.Ninjutsu;

        NinjaAvancado Sasuke = new NinjaAvancado("Sasuke Uchiha", 18, "Goukakyuu No Jutsu", "Sharingan");
        TipoHabilidade GoukakyuuNoJutsu = TipoHabilidade.Ninjutsu;
        TipoHabilidade Sharingan = TipoHabilidade.Doujutsu;

        NinjaAvancado Hinata = new NinjaAvancado("Hinata Hyuga", 18, "Juuho Soushiken", "Byakugan");
        TipoHabilidade JuuhoSoushiken = TipoHabilidade.Ninjutsu;
        TipoHabilidade Byakugan = TipoHabilidade.Doujutsu;

        NinjaBasico RockLee = new NinjaBasico("Rock Lee", 18, "Konoha Senpu");
        TipoHabilidade KonohaSenpu = TipoHabilidade.Taijutsu;

        int escolha = 0;

        while(escolha != 3){
            System.out.println("\n=====Menu=====");
            System.out.println("O que você quer fazer?");
            System.out.println("1. Listar personagens");
            System.out.println("2. Usar habilidades");
            System.out.println("3. Sair");
            System.out.print("Digite aqui: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    Naruto.mostrarInformacoes();
                    System.out.println("Tipo da Habilidade: " + Rasengan);
                    Sasuke.mostrarInformacoes();
                    System.out.println("Tipo da Habilidade: " + GoukakyuuNoJutsu);
                    System.out.println("Tipo da Habilidade Especial: " + Sharingan);
                    Hinata.mostrarInformacoes();
                    System.out.println("Tipo da Habilidade: " + JuuhoSoushiken);
                    System.out.println("Tipo da Habilidade Especial: " + Byakugan);
                    RockLee.mostrarInformacoes();
                    System.out.println("Tipo da Habilidade: " + KonohaSenpu);
                    break;
                case 2:
                    System.out.println("\n");
                    Naruto.executarHabilidade();
                    Sasuke.executarHabilidade();
                    Hinata.executarHabilidade();
                    RockLee.executarHabilidade();
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Entrada inválida. Digite novamente.");
                    break;
            }

        }
        scanner.close();
    }
}
