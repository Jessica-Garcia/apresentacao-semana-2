package br.com.jessica.immutable;

import java.util.Date;

// Fazer uma classe final
public final class ImmutableClass {
    // Declarar todas as variáveis como final e privadas

    private final Integer atributoImutavel1; // já é uma classe imutável, não tem método que altera o valor
    private final String atributoImutavel2; // já é uma classe imutável
    private final Date atributoMutavel1; // é uma classe mutável, tem métodos que alteram valor

    public ImmutableClass(Integer atributoImutavel1, String atributoImutavel2, Date atributoMutavel1) {
        this.atributoImutavel1 = atributoImutavel1;
        this.atributoImutavel2 = atributoImutavel2;
        // Sempre criar uma nova instância atribuindo com cópia do atributo (deep copy, cópia defensiva)
        this.atributoMutavel1 = new Date(atributoMutavel1.getTime());
    }

    //Criar apenas getters e nenhum setter


    public Integer getAtributoImutavel1() {
        return atributoImutavel1; // para classes imutáveis tudo bem retornar diretamente a referência;
    }

    public String getAtributoImutavel2() {
        return atributoImutavel2;
    }

    public Date getAtributoMutavel1() {
        return new Date(atributoMutavel1.getTime()); // retornar um novo objeto com cópia do atributo
        //return atributoMutavel1; não fazer isso para objetos mutáveis,
        // pois de alguma forma(???) isso poderá alterar o estado do objeto
    }

    @Override
    public String toString() {
        return "ID: " + atributoImutavel1 +
                ", Nome: " + atributoImutavel2 +
                ", Data de Nascimento: " + atributoMutavel1;
    }
}
