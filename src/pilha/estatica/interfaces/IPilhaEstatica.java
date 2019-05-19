/*

APS - ESTRUTURA DE DADOS
ALUNOS: 
Lucas Rodrigues Souza - RA: 21069949
Danilo Ferrari - RA: 21086355
Manoel Merlin - RA: 21154363
Lucas Oliveira - RA:  21094755

 */
package pilha.estatica.interfaces;

public interface IPilhaEstatica {

    public boolean isEmpty();

    public boolean isFull();

    public void push(Object valor) throws Exception;

    public Object pop() throws Exception;

    public Object peek() throws Exception;

    public int size();

    public String exibirPilha();

}
