package MSN;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        //encapsulando os metodos validar e salvar dentro do enviar
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo facebook");
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo facebook");
    }


    public void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico da mensagem");
    }
}
