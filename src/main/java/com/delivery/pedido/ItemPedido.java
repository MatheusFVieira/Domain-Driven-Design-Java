package com.delivery.pedido;

public class ItemPedido {

    // ============================================
    // DADOS DO ITEM
    // ============================================

    private final String nome;           // Ex: "Pizza Calabresa"
    private final int quantidade;        // Ex: 2
    private final double precoUnitario;  // Ex: 45.90

    // ============================================
    // CONSTRUTOR
    // ============================================

    public ItemPedido(String nome, int quantidade, double precoUnitario) {
        // Validação: quantidade tem que ser pelo menos 1
        if (quantidade < 1) {
            throw new IllegalArgumentException(
                "Quantidade deve ser pelo menos 1!"
            );
        }

        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // ============================================
    // COMPORTAMENTO - Calcular subtotal
    // ============================================

    public double calcularSubtotal() {
        return this.quantidade * this.precoUnitario;
    }

    // ============================================
    // GETTERS
    // ============================================

    public String getNome()          { return nome; }
    public int getQuantidade()       { return quantidade; }
    public double getPrecoUnitario() { return precoUnitario; }

} // Fecha a classe ItemPedido
