package br.com.jessica.tipos.teste;

import br.com.jessica.tipos.modelo.Cliente;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Valores padrão dos tipos primitivo e wrapper");
        System.out.println("Idade tipo Primitivo: " + cliente.getIdadePrimitivo());
        System.out.println("Idade tipo Wrapper: " + cliente.getIdadeWrapper());
    }
}
