package Questao2;

public class contaPoupanca implements interfaceConta{

    private double saldo;
    public contaPoupanca(){
        this.saldo = 0.0;
    }
    @Override
    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 ){
            if (valor <= this.saldo){
                this.saldo = this.saldo - valor;
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else{
            System.out.println("Não foi possivel realizar a operação. valor INVALIDADO.");
        }
    }

    @Override
    public void depositar(double valor){
        if (valor > 0){
            this.saldo = this.saldo + valor;
        } else{
            System.out.println("Não foi possivel realizar a operação. valor INVALIDADO.");
        }
    }

    @Override
    public String toString(){
        return "Conta corrente\nsaldo:" + "R$ " + saldo;

    }

}
