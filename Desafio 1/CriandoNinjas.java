package NivelBasico.Desafio1;

public class CriandoNinjas {
    public static void main(String[] args) {

        String StatusConclusao1;
        String StatusConclusao2;
        String StatusConclusao3;

        //Ninja 1
        String NomeNinja1 = "Naruto";
        int Idade1 = 13;
        String NomeDaMissao1 = "Resgatar um gato perdido";
        char NivelDaMissao1 = 'D';

        //Ninja 2
        String NomeNinja2 = "Kakashi";
        int Idade2 = 27;
        String NomeDaMissao2 = "Escoltar o hokage até outra vila";
        char NivelDaMissao2 = 'S';

        //Ninja 3
        String NomeNinja3 = "Rock Lee";
        int Idade3 = 13;
        String NomeDaMissao3 = "Capturar um assassino";
        char NivelDaMissao3 = 'A';

        //Missao 1
        if (Idade1 < 15 ){
            if (NivelDaMissao1 == 'D' || NivelDaMissao1 == 'C') {
                StatusConclusao1 = "Concluido";
            } else {
                StatusConclusao1 = "Nao Concluido";
            }
        } else {
            StatusConclusao1 = "Concluido";
        }

        //Missao 2
        if (Idade2 < 15 ){
            if (NivelDaMissao2 == 'D' || NivelDaMissao2 == 'C') {
                StatusConclusao2 = "Concluido";
            } else {
                StatusConclusao2 = "Nao Concluido";
            }
        } else {
            StatusConclusao2 = "Concluido";
        }

        //Missao 3
        if (Idade3 < 15 ){
            if (NivelDaMissao3 == 'D' || NivelDaMissao3 == 'C') {
                StatusConclusao3 = "Concluido";
            } else {
                StatusConclusao3 = "Nao Concluido";
            }
        } else {
            StatusConclusao3 = "Concluido";
        }

        System.out.println("Nome do Ninja: " + NomeNinja1);
        System.out.println("Idade: " + Idade1);
        System.out.println("Missão: " + NomeDaMissao1);
        System.out.println("Rank: " + NivelDaMissao1);
        System.out.println("Status da Missão: " + StatusConclusao1);
        System.out.println("----------------------------------------------------");

        System.out.println("Nome do Ninja: " + NomeNinja2);
        System.out.println("Idade: " + Idade2);
        System.out.println("Missão: " + NomeDaMissao2);
        System.out.println("Rank: " + NivelDaMissao2);
        System.out.println("Status da Missão: " + StatusConclusao2);
        System.out.println("----------------------------------------------------");

        System.out.println("Nome do Ninja: " + NomeNinja3);
        System.out.println("Idade: " + Idade3);
        System.out.println("Missão: " + NomeDaMissao3);
        System.out.println("Rank: " + NivelDaMissao3);
        System.out.println("Status da Missão: " + StatusConclusao3);
        System.out.println("----------------------------------------------------");


    }
}
