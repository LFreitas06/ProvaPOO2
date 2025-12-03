package Questao2;

public class contaCorrente implements interfaceConta{
    private double saldo;
    public contaCorrente() {
        this.saldo = 0.0;
    }

    @Override
    public double getSaldo(){
        return this.saldo;
    }

    public void sacar(double valor) {
      if (valor > 0){
          double valorTaxa = valor + (valor * 0.20);
          if (valorTaxa <= this.saldo){
              this.saldo = this.saldo - valorTaxa;
          } else {
              System.out.println("Saldo insuficiente.");
          }
      } else {
          System.out.println("Não foi possivel realizar a operação. valor INVALIDADO.");
      }
    }

    public void depositar(double valor){
        if (valor > 0){
            double valorTaxa = valor - (valor * 0.20);
            this.saldo += valorTaxa;
        }else {
            System.out.println("Não foi possivel realizar a operação. valor INVALIDADO.");
        }
    }

    @Override
    public String toString(){
        return "Conta corrente\nsaldo:" + "R$ " + saldo;
    }
}