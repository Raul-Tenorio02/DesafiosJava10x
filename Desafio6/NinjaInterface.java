package NivelIntermediario.Desafio6;

public interface NinjaInterface {

    void listarNinjas(int indiceNinja);
    void listarNinjas();

    void removerNinjas(int indiceNinja);
    void adicionarNinjas(int indiceNinja, String nome, int idade, String aldeia);

    //TODO: void reorganizarLista();
}
