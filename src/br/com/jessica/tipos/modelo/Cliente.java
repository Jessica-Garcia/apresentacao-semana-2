package br.com.jessica.tipos.modelo;

public class Cliente {
    private String nome;
    private int idadePrimitivo;
    private Integer idadeWrapper;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadePrimitivo() {
        return idadePrimitivo;
    }

    public void setIdadePrimitivo(int idadePrimitivo) {
        this.idadePrimitivo = idadePrimitivo;
    }

    public Integer getIdadeWrapper() {
        return idadeWrapper;
    }

    public void setIdadeWrapper(Integer idadeWrapper) {
        this.idadeWrapper = idadeWrapper;
    }
}
