public class Ejercicio4 {
    public static void main(String[] args) {
        Banco cuenta = new Banco();
        cuenta.depositar(100);
        cuenta.retirar(50);
        cuenta.retirar(200);
        System.out.println("Saldo: "+cuenta.getSaldo()+ "$");
    }
}
