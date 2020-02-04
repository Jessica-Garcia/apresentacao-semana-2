package br.com.jessica.equalshashcode.equals.usuario;

public class EqualsTesteUsuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@gmail.com";

        System.out.println(u1 == u2); // false
        System.out.println("Comparação com equals: " + u1.equals(u2));

    }
}
