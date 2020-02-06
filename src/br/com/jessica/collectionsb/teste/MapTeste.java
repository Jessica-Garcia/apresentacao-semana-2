package br.com.jessica.collectionsb.teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTeste {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        //associando palavra incoreta com a correta
        map.put("teklado", "teclado");
        map.put("mose", "mouse");
        map.put("vc", "você");
        map.put("meza", "mesa");

//        //iterando pelas chaves
//        for (String chave : map.keySet()){
//            System.out.println(chave);
//        }
//
//        //iterando pelo valor
//        for (String valor : map.values()){
//            System.out.println(valor);
//        }

        //iterando pela chave e valor
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


    }
}
