package MSN;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        //deveremos escolher um app de servicos de mensagem (Facebook ou MSN)
        String escolha = "msn";

        //aplicando a escolha ao objeto instanciado smi
        if(escolha.equals("msn"))
            smi = new MSNMessenger();
        else if (escolha.equals("facebook"))
            smi = new FacebookMessenger();
        
        //executando os metodos de enviar e receber de acordo com as especificações de classes especializadas
        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
