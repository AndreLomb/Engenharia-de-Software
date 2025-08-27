package br.inatel.cdg.test;

import br.inatel.cdg.EmptyQueueException;
import br.inatel.cdg.Fila;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilaTeste {

    @Test
    public void testeFilaVazia(){
        Fila<Integer> filaInteiros = new Fila<Integer>();
        boolean vazia = filaInteiros.filaVazia();
        assertTrue(vazia);
    }

    @Test
    public void testeFilaEnfileirada(){
        Fila<Integer> filaInteiros = new Fila<Integer>();
        filaInteiros.enfileirar(10);
        int tamanho = filaInteiros.size();

        assertEquals(1, tamanho);
    }

    @Test
    public void testeFilaRemove() throws EmptyQueueException {
        Fila<Integer> filaInteiros = new Fila<Integer>();
        filaInteiros.enfileirar(10);
        filaInteiros.removerFila();
        int tamanho = filaInteiros.size();

        assertEquals(0, tamanho);
    }
    @Test
    public void testeFilaRemoveException(){
        Fila<Integer> filaInteiros = new Fila<Integer>();

        assertThrows(EmptyQueueException.class, filaInteiros::removerFila);
    }
}
