package com.delivery.pedido;

import java.util.ArrayList;
import java.util.List;
import com.delivery.cliente.Endereco;

public class Pedido {

    // ============================================
    // DADOS DO PEDIDO
    // ============================================

    private final String id;                  // Identidade única
    private final String clienteId;           // Quem fez o pedido
    private final Endereco enderecoEntrega;   // Onde entregar
    private List<ItemPedido> itens;           // Lista de itens
    private String status;                    // Status atual

    // ============================================
    // CONSTRUTOR
    // ============================================

    public Pedido(String clienteId, Endereco enderecoEntrega) {
        this.id = java.util.UUID.randomUUID().toString();
        this.clienteId = clienteId;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = new ArrayList<>();   // Começa com lista vazia
        this.status = "CRIADO";           // Status inicial

        System.out.println("📋 Pedido criado! ID: " + this.id);
    }

    // ============================================
    // COMPORTAMENTOS DO PEDIDO
    // ============================================

    // Adicionar um item ao pedido
    public void adicionarItem(ItemPedido item) {
        // REGRA DE NEGÓCIO: só adiciona se ainda está montando
        if (!this.status.equals("CRIADO")) {
            System.out.println("❌ Não pode mais adicionar itens!");
            return;
        }

        this.itens.add(item);
        System.out.println("✅ Item adicionado: " + item.getNome());
    }

    // Confirmar o pedido
    public void confirmar() {
        // REGRA DE NEGÓCIO: não pode confirmar pedido vazio
        if (this.itens.isEmpty()) {
            System.out.println("❌ Pedido vazio! Adicione itens.");
            return;
        }

        this.status = "CONFIRMADO";
        System.out.println("🎉 Pedido confirmado!");
    }

    // Calcular o total do pedido
    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : this.itens) {
            total = total + item.calcularSubtotal();
        }
        return total;
    }

    // Mostrar resumo do pedido
    public void mostrarResumo() {
        System.out.println("\n====== PEDIDO ======");
        System.out.println("ID: " + this.id);
        System.out.println("Status: " + this.status);
        System.out.println("Itens:");
        for (ItemPedido item : this.itens) {
            System.out.println("  - " + item.getNome() +
                               " x" + item.getQuantidade() +
                               " = R$ " + item.calcularSubtotal());
        }
        System.out.println("TOTAL: R$ " + calcularTotal());
        System.out.println("===================\n");
    }

    // ============================================
    // GETTERS
    // ============================================

    public String getId()                  { return id; }
    public String getClienteId()           { return clienteId; }
    public Endereco getEnderecoEntrega()   { return enderecoEntrega; }
    public List<ItemPedido> getItens()     { return itens; }
    public String getStatus()              { return status; }

} // Fecha a classe Pedido
