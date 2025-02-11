package NivelIntermediario.Desafio6;

import java.util.LinkedList;

public class Ninja implements NinjaInterface{

    private String nome;
    private int idade;
    private String aldeia;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", aldeia='" + aldeia + '\'' +
                '}';
    }

    LinkedList<Ninja> listDeNinjas = new LinkedList<>();

    public Ninja(){
        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konohagakure"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konohagakure"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konohagakure"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konohagakure"));
        listDeNinjas.add(new Ninja("Shimakaru Nara", 17, "Konohagakure"));
        listDeNinjas.add(new Ninja("Ino Yamanaka", 17, "Konohagakure"));
        listDeNinjas.add(new Ninja("Choji Akimichi", 17, "Konohagakure"));
    }

    @Override
    public void listarNinjas() {
        if (!listDeNinjas.isEmpty()) {
            System.out.println("\n==========LISTA ATUAL==========");
            for (Ninja ninja : listDeNinjas) {
                System.out.println(ninja);
            }
        }
    }
    @Override
    public void listarNinjas(int indiceNinja){
        System.out.println("Ninja do índice " + indiceNinja + ": " + listDeNinjas.get(indiceNinja));
    }

    @Override
    public void removerNinjas(int indiceNinja){
        if (!listDeNinjas.isEmpty()) {
            if (indiceNinja == 0) {
                System.out.println("\nSucesso! Ninja removido: " + listDeNinjas.removeFirst());
            } else if (indiceNinja > 0){
                System.out.println("\nSucesso! Ninja removido: " + listDeNinjas.remove(indiceNinja));
            } else {
                System.out.println("Erro: entrada inválida.");
            }
        }
    }

    @Override
    public void adicionarNinjas(int indiceNinja, String nome, int idade, String aldeia){
        if (!listDeNinjas.isEmpty()) {
            if (indiceNinja == 0) {
                listDeNinjas.addFirst(new Ninja(this.nome, this.idade, this.aldeia));
                System.out.println("\nSucesso! Ninja adicionado: " + listDeNinjas.getFirst());
            } else if (indiceNinja > 0){
                listDeNinjas.add(indiceNinja, new Ninja(this.nome, this.idade, this.aldeia));
                System.out.println("\nSucesso! Ninja adicionado: " + listDeNinjas.get(indiceNinja));
            } else {
                System.out.println("Erro: entrada inválida.");
            }
        }
    }

}
