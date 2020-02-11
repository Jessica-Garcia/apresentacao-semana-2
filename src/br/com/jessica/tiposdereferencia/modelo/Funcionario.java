package br.com.jessica.tiposdereferencia.modelo;

public class Funcionario {
    private Integer id;
    private String nome;

    public Funcionario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id = " + id +
                ", nome =' " + nome + '\'' +
                '}';
    }
}
