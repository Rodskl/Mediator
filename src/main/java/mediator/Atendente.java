package mediator;

public class Atendente extends Funcionario {
    public Atendente(Mediator mediator) {
        super(mediator);
    }

    @Override
    public String enviarMensagem(String mensagem) {
        return this.mediator.receberMensagemAtendente(mensagem);
    }
}