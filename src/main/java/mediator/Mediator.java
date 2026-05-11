package mediator;

public interface Mediator {
    String receberMensagemCozinha(String mensagem);
    String receberMensagemAtendente(String mensagem);
    String receberMensagemDelivery(String mensagem);
    
}
