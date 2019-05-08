package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import pilha.estatica.classes.PilhaEstatica;
import pilha.estatica.exceptions.PilhaEstaticaException;

public class PilhaEstaticaTest {

    PilhaEstatica pilhaEstatica;

    @Before
    public void inicializarTest() {
        pilhaEstatica = new PilhaEstatica(5);
    }

    @Test
    public void testPilhaVazia() {
        Assert.assertTrue(pilhaEstatica.isEmpty());
    }

    @Test
    public void testInserirUmDado() throws Exception {
        pilhaEstatica.push(1);
        Assert.assertEquals(1, pilhaEstatica.pop());
    }

    @Test
    public void testInserirMaisDeUmDado() throws Exception {
        pilhaEstatica.push(1);
        pilhaEstatica.push(2);
        pilhaEstatica.push(3);
        Assert.assertEquals(3, pilhaEstatica.pop());
        Assert.assertEquals(2, pilhaEstatica.pop());
        Assert.assertEquals(1, pilhaEstatica.pop());
    }

    @Test
    public void testPilhaCheia() throws Exception {
        Assert.assertFalse(pilhaEstatica.isFull());
        pilhaEstatica.push(1);
        pilhaEstatica.push(2);
        pilhaEstatica.push(3);
        pilhaEstatica.push(4);
        pilhaEstatica.push(5);
        Assert.assertTrue(pilhaEstatica.isFull());
    }

    @Test(expected = PilhaEstaticaException.class)
    public void testInserirDadoComPilhaCheia() throws Exception {
        pilhaEstatica.push(1);
        pilhaEstatica.push(2);
        pilhaEstatica.push(3);
        pilhaEstatica.push(4);
        pilhaEstatica.push(5);
        pilhaEstatica.push(6);
    }

    @Test(expected = PilhaEstaticaException.class)
    public void testRemoverDadoComPilhaVazia() throws Exception {
        pilhaEstatica.pop();
    }

    @Test
    public void testObterDadoDoTopo() throws Exception {
        pilhaEstatica.push(1);
        pilhaEstatica.push(2);
        pilhaEstatica.push(3);

        Assert.assertEquals(3, pilhaEstatica.peek());
    }

    @Test(expected = PilhaEstaticaException.class)
    public void testObterDadoDoTopoComPilhaVazia() throws Exception {
        pilhaEstatica.peek();
    }

    @Test
    public void obterTamanhoAtualDeElementosNaPilha() throws Exception {
        Assert.assertEquals(0, pilhaEstatica.size());
        pilhaEstatica.push(1);
        pilhaEstatica.push(2);
        pilhaEstatica.push(3);
        Assert.assertEquals(3, pilhaEstatica.size());
    }
}
