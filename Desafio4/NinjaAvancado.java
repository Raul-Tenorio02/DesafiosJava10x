package NivelIntermediario.Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    String especialidade;

    @Override
    public void mostrarInformacoes(){
        System.out.println("\nMeu nome é " + nome + " e eu tenho "
                + idade + " anos." + "\nHabilidade: " + habilidade
                + "\nHabilidade Especial: " +  especialidade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println(nome + " usou seu " + habilidade +
                " junto com o " + especialidade + "!\n");
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

}
