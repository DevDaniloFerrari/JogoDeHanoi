package pilha.estatica.interfaces;

public interface IPilhaEstatica{
    
    public boolean isEmpty();
    public boolean isFull();
    public void push(Object valor) throws Exception;
    public Object pop() throws Exception;
    public Object peek() throws Exception;
    public int size();
    
}