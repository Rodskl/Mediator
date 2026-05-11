package mediator;

public class Cozinha extends Funcionario {
    public Cozinha(Mediator mediator) {
        super(mediator);
    }

    @Override
    public String enviarMensagem(String mensagem) {
        return this.mediator.receberMensagemCozinha(mensagem);
    }
}