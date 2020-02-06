package br.com.jessica.collectionsb.classes;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String id;
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(String id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // método para ordenar por id
    @Override
    public int compareTo(Produto outroProduto) {
        return this.id.compareTo(outroProduto.getId());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id = '" + id + '\'' +
                " nome = '" + nome + '\'' +
                " preço = R$ " + String.format("%.2f", preco) +
                " quantidade = " + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
