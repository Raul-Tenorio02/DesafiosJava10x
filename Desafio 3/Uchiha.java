public class Uchiha extends Ninja implements HabilidadesEspeciais {

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

    @Override
    public void AtualizarHabilidadeEspecial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nova habilidade: ");
        this.habilidadeEspecial = scanner.nextLine();
        System.out.println("Habilidade especial atualizada!");
    }
}
