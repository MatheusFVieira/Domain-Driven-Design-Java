package com.delivery.entrega;

public class Entregador {

    // ============================================
    // DADOS DO ENTREGADOR
    // ============================================

    private String id;            // Identificador único
    private String nome;          // Nome do entregador
    private String veiculo;       // Tipo de veículo ('Moto', 'Bicicleta', 'Carro')
    private boolean disponivel;   // Se está livre para entregas

    // ============================================
    // CONSTRUTOR
    // ============================================

    public Entregador(String nome, String veiculo) {
        this.id = java.util.UUID.randomUUID().toString();
        this.nome = nome;
        this.veiculo = veiculo;
        this.disponivel = true; // Começa disponível

        System.out.println("🛵 Entregador cadastrado: " + nome + " (" + veiculo + ")");
    }

    // ============================================
    // COMPORTAMENTOS DO ENTREGADOR
    // ============================================

    // Marca como disponível para entregas
    public void ficarDisponivel() {
        this.disponivel = true;
        System.out.println("✅ " + nome + " está disponível para entregas!");
    }

    // Marca como ocupado (indisponível)
    public void iniciarEntrega() {
        // REGRA DE NEGÓCIO: só pode iniciar se estiver disponível!
        if (!this.disponivel) {
            System.out.println("❌ " + nome + " já está em uma entrega!");
            return;
        }

        this.disponivel = false;
        System.out.println("🛵 " + nome + " saiu para entrega!");
    }

    // Marca como disponível novamente
    public void finalizarEntrega() {
        this.disponivel = true;
        System.out.println("🎉 " + nome + " finalizou a entrega e está disponível!");
    }

    // ============================================
    // GETTERS
    // ============================================

    public String getId()        { return id; }
    public String getNome()      { return nome; }
    public String getVeiculo()   { return veiculo; }
    public boolean isDisponivel() { return disponivel; }

} // Fecha a classe Entregador
