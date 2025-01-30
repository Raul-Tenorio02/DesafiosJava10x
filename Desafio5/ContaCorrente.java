package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    TipoConta tipoConta;

    public ContaCorrente(double saldo, String nomeNinja) {
        super(saldo, nomeNinja);
        this.tipoConta = TipoConta.CORRENTE;
    }

    @Override
    public void depositar(double valor) {
        System.out.println("\nDepositando 両" + valor + " na Conta " +
                TipoConta.CORRENTE + " de " + nomeNinja + "...");
        this.saldo += valor - 0.01;
        System.out.println("Saldo Corrente | " + nomeNinja + ": 両" + saldo);
    }
}
