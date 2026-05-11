package mediator;

public class SistemaCentral implements Mediator {
    private static SistemaCentral instancia = new SistemaCentral();
    private SistemaCentral() {}
    public static SistemaCentral getInstancia() {
        return instancia;
    }

    @Override
    public String receberMensagemCozinha(String mensagem) {
        return "Sistema Central recebeu aviso da Cozinha e notificou o Atendente: " + mensagem;
    }

    @Override
    public String receberMensagemAtendente(String mensagem) {
        return "Sistema Central recebeu pedido do Atendente e enviou para a Cozinha: " + mensagem;
    }

    @Override
    public String receberMensagemDelivery(String mensagem) {
        return "Sistema Central recebeu aviso de entrega e atualizou o status do pedido: " + mensagem;
    }
}