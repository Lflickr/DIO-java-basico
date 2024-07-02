public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("32765065");
            System.out.println(cepFormatado);
        }
        catch(CepInvalidoException e){
            //e.printStackTrace();
            System.err.println("O CEP não condiz com as regras de negocio");
        }
    } 
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();
        
        //simular cep formatado
        return "32.765-065";
    }   
}
