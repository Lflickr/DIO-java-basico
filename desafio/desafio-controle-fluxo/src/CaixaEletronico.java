//teste de condicional simples
public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorsolicitado = 17.0;

        if(valorsolicitado <= saldo)
            saldo -= valorsolicitado;

        System.out.println(saldo);
    }
}
