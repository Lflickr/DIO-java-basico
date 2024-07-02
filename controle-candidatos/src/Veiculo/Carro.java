package Veiculo;

//classe especializada Carro, filha da classe Veiculo
public class Carro extends Veiculo {

    
    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligado");
    }
    //encapsulando metodos de conferir cambio e conferir combustivel
    //dessa forma, a classe autodromo so precisa chamar o metodo ligar, ao inves de ter que chamar todos os metodos
    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }
}
