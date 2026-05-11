package mediator;

public class Delivery extends Funcionario {
    public Delivery(Mediator mediator) {
        super(mediator);
    }

    @Override
    public String enviarMensagem(String mensagem) {
        return this.mediator.receberMensagemDelivery(mensagem);
    }
}