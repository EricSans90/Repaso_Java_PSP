public class Banco {
    private double saldo = 0.0;

    public double getSaldo() {
        return saldo;
    }

    public Banco() {
        this.saldo = 0.0;
    }

    public void depositar (double deposito){
        this.saldo += deposito;
    }

    public void retirar (double retiro){
        if (retiro > this.saldo){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= retiro;
        }

    }
}
