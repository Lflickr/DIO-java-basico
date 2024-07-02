package MSN;

//classe abstrata com metodos abstratos e sem corpo (sem a logica do metodo)
public abstract class ServicoMensagemInstantanea {
    //metodos de enviar e receber foram abstraidos
    //as classes filhas deverao desenvolver seus proprios metodos de enviar e receber
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected abstract void salvarHistoricoMensagem();
    
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
}
