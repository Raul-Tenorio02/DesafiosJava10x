package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;


    public void mostrarInformacoes() {
        System.out.println("\nMeu nome é " + nome + " e eu tenho "
        + idade + " anos." + "\nHabilidade: " + habilidade);
    }

    public void executarHabilidade(){
        System.out.println(nome + " usou seu " + habilidade + "!\n");
    }

    public NinjaBasico(String nome, int idade, String habilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico(){

    }

}
