package br.com.jessica.tipos.teste;

public class TesteDoubleInfinityNaN {
    public static void main(String[] args) {
        Double numero = 0.0;
        Double denom = 0.0;

        Double div = numero / denom;
        if(div.isInfinite()){
            System.out.println("Número inválido");
        }
        else if(div.isNaN()){
            System.out.println("Número inválido2");
        }
        else{
            System.out.println(div);
        }
    }
}
