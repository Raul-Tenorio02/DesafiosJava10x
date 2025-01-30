package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    double juros = 0.1;
    double jurosAno = juros*100;
    TipoConta tipoConta;

    public ContaPoupanca(double saldo, String nomeNinja) {
        super(saldo, nomeNinja);
        this.tipoConta = TipoConta.POUPANCA;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        double rendimento = valor*(1+juros);
        System.out.println("\nSaldo Poupança| " + nomeNinja + ": 両" + saldo);
        System.out.println("Rendimento atual da poupança: " + jurosAno + "% a.a");
        System.out.println("Rendimento esperado da aplicação: 両" + rendimento);
    }
}
