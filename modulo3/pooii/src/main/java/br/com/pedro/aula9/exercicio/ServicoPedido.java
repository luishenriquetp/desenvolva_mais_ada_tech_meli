package br.com.pedro.aula9.exercicio;


public class ServicoPedido {
    private MetodoPagamento metodoPagamento;
    private ServicoNotificacao servicoNotificacao;

    public ServicoPedido(MetodoPagamento metodoPagamento, ServicoNotificacao servicoNotificacao) {
        this.metodoPagamento = metodoPagamento;
        this.servicoNotificacao = servicoNotificacao;
    }

    public void processarPedido(Pedido pedido) {
        metodoPagamento.processarPagamento(pedido.getId() ,pedido.getValor());
        System.out.println("Pedido: " + pedido.getId() + ", Descrição: " + pedido.getDescricao() + ", Valor: " + pedido.getValor());
    }
}
