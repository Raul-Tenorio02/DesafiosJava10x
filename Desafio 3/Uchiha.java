package NivelIntermediario.Desafios2.Heranca;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println(habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("\nFicha Tecnica: " + "\nNome: " + nome + "\nIdade: "
                + idade + "\nMissao: " + missao + "\nRank: " + nivelDificuldade + "\nStatus: "
                + statusMissao + "\nHabilidade Especial: " + habilidadeEspecial
                + "\n==============================");
    }
}
