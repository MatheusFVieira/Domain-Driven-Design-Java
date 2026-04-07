package com.delivery.cliente;

public class Endereco {

    // ============================================
    // DADOS DO ENDEREÇO
    // Todos são 'final' = não podem mudar depois de criado!
    // ============================================

    private final String rua;
    private final String numero;
    private final String bairro;
    private final String cidade;
    private final String cep;

    // ============================================
    // CONSTRUTOR
    // ============================================

    public Endereco(String rua, String numero, String bairro,
                    String cidade, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    // ============================================
    // GETTERS (só leitura, não tem como mudar!)
    // ============================================

    public String getRua()     { return rua; }
    public String getNumero()  { return numero; }
    public String getBairro()  { return bairro; }
    public String getCidade()  { return cidade; }
    public String getCep()     { return cep; }

    // ============================================
    // MÉTODO ÚTIL - Mostra o endereço completo
    // ============================================

    public String mostrarCompleto() {
        return rua + ", " + numero + " - " + bairro +
               ", " + cidade + " - CEP: " + cep;
    }

} // Fecha a classe Endereco
