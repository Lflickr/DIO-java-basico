package Veiculo;

//classe generica veiculo que possui chassi e placa
public abstract class Veiculo {
//a classe veiculo é abstrata, por que ela não sabe exatamento como seus metodos funcionam
//mas seus filhos tem que ter a definção destes metodos
    private String chassi;
    private String placa;

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public String getPlaca() {
        return placa;
    }

    //o metodo ligar é abstrato, cada classe filha tem um, porem de um jeito não necessariamente igual
    public abstract void ligar();
}
