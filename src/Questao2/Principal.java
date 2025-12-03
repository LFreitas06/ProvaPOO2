package Questao2;

public class Principal {
    public static void main(String[] args) {
        contaPoupanca cP = new contaPoupanca();
        cP.depositar(114);
        System.out.println("Saldo da conta poupança: " + cP.getSaldo());
        cP.sacar(30);
        System.out.println("Saldo da conta poupança: " + cP.getSaldo());

        System.out.println();

        contaCorrente cC = new contaCorrente();
        cC.depositar(200);
        System.out.println("Saldo da conta corrente: " + cC.getSaldo());
        cC.sacar(100);
        System.out.println("Saldo da conta corrente: " + cC.getSaldo());
    }
}
