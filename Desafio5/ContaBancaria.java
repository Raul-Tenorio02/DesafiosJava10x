package NivelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta, BancoDeKonoha {
    double saldo;
    String nomeNinja;

    public ContaBancaria(double saldo, String nomeNinja) {
        this.saldo = saldo;
        this.nomeNinja = nomeNinja;
    }

    @Override
    public void consultarSaldo(){
        System.out.println("両" + this.saldo);
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public void transferir(double valor, ContaBancaria contaDestinatario){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("\nRealizando transferência...");
            contaDestinatario.depositar(valor);
        } else {
            System.out.println("\nVocê não tem esse valor para transferir.");
        }
    }

}
