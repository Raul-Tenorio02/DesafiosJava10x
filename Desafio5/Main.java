package NivelIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaBancaria NarutoCorrente = new ContaCorrente(0, "Naruto Uzumaki");
        ContaBancaria NarutoPoupanca = new ContaPoupanca(0, "Naruto Uzumaki");

        System.out.println("\n=====Banco de Konoha=====");
        System.out.println("=====Poupança isenta de taxa!=====");

        NarutoCorrente.depositar(300);
        NarutoCorrente.transferir(100, NarutoPoupanca);

        ContaBancaria SasukeCorrente = new ContaCorrente(0, "Sasuke Uchiha");

        NarutoCorrente.transferir(100, SasukeCorrente);

    }
}
