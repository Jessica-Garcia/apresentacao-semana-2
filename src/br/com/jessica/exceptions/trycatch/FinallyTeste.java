package br.com.jessica.exceptions.trycatch;

public class FinallyTeste {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for(int i=0; i<numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
                System.out.println("executou com sucesso!");
            }
            catch(ArithmeticException e){
                System.out.println("Erro ao dividir por zero");
                System.exit(0); // termina execução, não deixa fynally executar
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: posição inválida");
                //System.exit(0);
            }
            finally{
                System.out.println("finally executa sempre após o try ou catch");
            }
        }
        System.out.println("Fim do programa");
    }
}
