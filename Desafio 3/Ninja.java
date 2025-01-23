package NivelIntermediario.Desafio3;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;



    public void mostrarInformacoes(){
        System.out.println("\nFicha Tecnica: " + "\nNome: " + nome + "\nIdade: "
                + idade + "\nMissao: " + missao + "\nRank: " + nivelDificuldade + "\nStatus: "
                + statusMissao + "\n==============================");
    }

}
