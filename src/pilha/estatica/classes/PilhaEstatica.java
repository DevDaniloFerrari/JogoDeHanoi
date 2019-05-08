package pilha.estatica.classes;

import pilha.estatica.exceptions.PilhaEstaticaException;
import pilha.estatica.interfaces.IPilhaEstatica;

public class PilhaEstatica<T> implements IPilhaEstatica {

    public PilhaEstatica(int tamanhoDaPilha) {
        this.Dados = new Object[tamanhoDaPilha];
        this.Topo = 0;
    }

    private final Object[] Dados;
    private int Topo;

    @Override
    public boolean isEmpty() {
        return Topo == 0;
    }

    @Override
    public boolean isFull() {
        return Topo == Dados.length;
    }

    @Override
    public void push(Object valor) throws Exception {

        if (isFull()) {
            throw new PilhaEstaticaException("Pilha cheia!");
        }

        Dados[Topo] = valor;
        Topo++;
    }

    @Override
    public Object pop() throws Exception {

        if (isEmpty()) {
            throw new PilhaEstaticaException("Pilha vazia!");
        }

        Topo--;
        Object objetoDeRetorno = Dados[Topo];
        return objetoDeRetorno;
    }

    @Override
    public Object peek() throws Exception{
        if (isEmpty()) {
            throw new PilhaEstaticaException("Pilha vazia!");
        }
        
        return Dados[(Topo-1)];
    }

    @Override
    public int size() {
        return Topo;
    }

}
