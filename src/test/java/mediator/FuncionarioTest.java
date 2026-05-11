package mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveProcessarMensagemAtendente() {
        Atendente atendente = new Atendente(SistemaCentral.getInstancia());
        assertEquals("Sistema Central recebeu pedido do Atendente e enviou para a Cozinha: Novo X-Bacon", 
                     atendente.enviarMensagem("Novo X-Bacon"));
    }

    @Test
    void deveProcessarMensagemCozinha() {
        Cozinha cozinha = new Cozinha(SistemaCentral.getInstancia());
        assertEquals("Sistema Central recebeu aviso da Cozinha e notificou o Atendente: Pedido 10 pronto", 
                     cozinha.enviarMensagem("Pedido 10 pronto"));
    }

    @Test
    void deveProcessarMensagemDelivery() {
        Delivery delivery = new Delivery(SistemaCentral.getInstancia());
        assertEquals("Sistema Central recebeu aviso de entrega e atualizou o status do pedido: Saiu para entrega", 
                     delivery.enviarMensagem("Saiu para entrega"));
    }
}