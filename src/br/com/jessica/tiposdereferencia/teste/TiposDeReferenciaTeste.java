package br.com.jessica.tiposdereferencia.teste;

import br.com.jessica.tiposdereferencia.modelo.Funcionario;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class TiposDeReferenciaTeste {
    public static void main(String[] args) {
        //strongReference();
        //weakReference();
        //softReference();
        //phantomReference();
    }
    private static void strongReference(){
        Funcionario emp = new Funcionario(1234, "Artur"); //emp = stronReference, não elegível ao garbage collector
        emp = null; // elegível ao gabage collector
    }
    private static void weakReference(){
        Funcionario emp = new Funcionario(1234, "Artur");
        WeakReference<Funcionario> weakReference = new WeakReference<>(emp);
        System.out.println(weakReference.get());
        emp = null;
        System.gc();
        System.out.println(weakReference.get());
    }
    private static void softReference(){
        Funcionario emp = new Funcionario(1234, "Artur");
        SoftReference<Funcionario> softReference = new SoftReference<>(emp);
        System.out.println(softReference.get());
        emp = null;
        System.gc();
        System.out.println(softReference.get());
    }
    private static void phantomReference(){
        Funcionario emp = new Funcionario(1234, "Artur");
        ReferenceQueue<Funcionario> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Funcionario> phantomReference = new PhantomReference<>(emp, referenceQueue);
        System.out.println(phantomReference.get());
    }
}
