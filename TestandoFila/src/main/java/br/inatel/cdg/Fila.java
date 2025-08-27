package br.inatel.cdg;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> {
    private List<T> elementos = new ArrayList<T>();
    private int tamanho = 0;

    public int size(){ return tamanho;}

    public boolean filaVazia(){ return (tamanho == 0);}

    public void enfileirar(T elem){
        elementos.add(elem);
        tamanho++;
    }

    public T removerFila() throws EmptyQueueException{
        if(filaVazia())
            throw new EmptyQueueException("Fila vazia!");
        T elem = elementos.remove(0);
        tamanho--;
        return elem;
    }
}
