package br.com.jessica.exceptions.personalizadas;

public class DivisaoNaoExataException extends Exception{
    private int num;
    private int denom;

    public DivisaoNaoExataException(int num, int denom){
        super();
        this.num = num;
        this.denom = denom;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + denom + " não é um inteiro";
    }
}
