

public class App {

    private String nome;
    private int idade;

    public App(int idade){
        this.idade = idade;
    }

    public String getNome() {
       return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        for(EstadosBrasileiro e: EstadosBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadosBrasileiro eb = EstadosBrasileiro.CEARA;
        System.out.println(eb.nomeMaiusculo());
    }
}
