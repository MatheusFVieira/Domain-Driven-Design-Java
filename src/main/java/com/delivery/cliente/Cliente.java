package com.delivery.cliente;

public class Cliente {

    // ============================================
    // O QUE O CLIENTE TEM (seus dados)
    // ============================================

    private String id;        // Identidade única (como CPF)
    private String nome;      // Nome do cliente
    private String email;     // Email para contato
    private String telefone;  // Telefone para contato

    // ============================================
    // CONSTRUTOR - Como criar um cliente novo
    // ============================================

    public Cliente(String nome, String email, String telefone) {
        // Gera um ID único automaticamente (tipo um CPF do sistema)
        this.id = java.util.UUID.randomUUID().toString();

        // Guarda os dados que recebeu
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

        // Mostra mensagem confirmando que criou
        System.out.println("✅ Cliente criado: " + nome);
    }

    // ============================================
    // GETTERS - Formas de ver os dados
    // ============================================

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefone() {
        return this.telefone;
    }

} // Fecha a classe Cliente
