package Veiculo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();

        Moto cg150 = new Moto();
        cg150.ligar();


        //A classe generica veiculo pode assumir um comportamento diferente, mediante ao polimorfismos das classes especializadas
        //Veiculo coringa = jeep;
        Veiculo coringa = cg150;

        coringa.ligar();
    }
}
