public enum EstadosBrasileiro {
    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
    CEARA("CE", "Ceará")
    ;

    private String sigla;
    private String nome;

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String nomeMaiusculo(){
        return nome.toUpperCase();
    }
    //construtor como private
    private EstadosBrasileiro(String sigla, String nome){
        this.nome = nome;
        this.sigla = sigla;
    }
}
