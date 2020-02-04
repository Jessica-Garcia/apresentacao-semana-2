package br.com.jessica.equalshashcode.equals.celular;

public class EqualsTesteCelular {
    public static void main(String[] args) {
        Celular c1 = new Celular("Iphone", "123456");
        Celular c2 = new Celular("Iphone", "123456");

        System.out.println(c2.equals(c1));
    }
}
