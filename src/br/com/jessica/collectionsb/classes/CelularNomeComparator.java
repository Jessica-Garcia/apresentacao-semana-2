package br.com.jessica.collectionsb.classes;

import java.util.Comparator;

public class CelularNomeComparator implements Comparator<Celular> {
    @Override
    public int compare(Celular cel1, Celular cel2) {
        return cel1.getNome().compareTo(cel2.getNome());
    }
}
