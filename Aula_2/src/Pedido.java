public class Pedido {
    private final String id;
    private String status;
    public Pedido(String id) {
        this.id = id;
        this.status = "ABERTO";
    }
    public void confirmar() {
        this.status = "CONFIRMADO";
    }

    public Pedido(String id, String clienteId) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException(
                    "Id do pedido é obrigatório"
            );
        }
        this.id = id; // final: não muda
        jamais
        this.clienteId = clienteId;
        this.itens = new ArrayList<>();
        this.status = StatusPedido.ABERTO;
        this.valorTotal = BigDecimal.ZERO;
    }

    public void adicionarItem(ItemPedido item) {
// 1. Verificar o estado
        if (this.status != StatusPedido.ABERTO) {
            throw new IllegalStateException(
                    "Pedido fechado não aceita novos itens");
        }
// 2. Executar
        this.itens.add(item);
// 3. Manter a consistência
        this.valorTotal =
                this.valorTotal.add(item.getSubtotal());
    }

}
