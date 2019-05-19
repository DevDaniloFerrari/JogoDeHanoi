/*

APS - ESTRUTURA DE DADOS
ALUNOS: 
Lucas Rodrigues Souza - RA: 21069949
Danilo Ferrari - RA: 21086355
Manoel Merlin - RA: 21154363
Lucas Oliveira - RA:  21094755

*/
package tests;

import jogo.JogoDeHanoi;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JogoDeHanoiTest {

    JogoDeHanoi jogoDeHanoi;

    @Before
    public void inicializarTest() throws Exception {
        jogoDeHanoi = new JogoDeHanoi(4);
    }

    @Test
    public void testFazerJogadaComOrigemEDestinoValidos() throws Exception {
        Assert.assertTrue(jogoDeHanoi.fazerJogada(1, 2));
    }

    @Test
    public void testFazerJogadaComOrigemEDestinoInvalidos() throws Exception {
        Assert.assertFalse(jogoDeHanoi.fazerJogada(2, 1));
    }

    @Test
    public void testTerminarJogada() throws Exception {
        jogoDeHanoi.fazerJogada(1, 2);
        jogoDeHanoi.fazerJogada(1, 3);
        jogoDeHanoi.fazerJogada(2, 3);
        jogoDeHanoi.fazerJogada(1, 2);
        jogoDeHanoi.fazerJogada(3, 2);
        jogoDeHanoi.fazerJogada(3, 1);
        jogoDeHanoi.fazerJogada(2, 3);
        jogoDeHanoi.fazerJogada(1, 2);
        jogoDeHanoi.fazerJogada(3, 2);
        jogoDeHanoi.fazerJogada(1, 3);
        jogoDeHanoi.fazerJogada(2, 1);
        jogoDeHanoi.fazerJogada(2, 3);
        jogoDeHanoi.fazerJogada(1, 2);
        jogoDeHanoi.fazerJogada(3, 1);
        jogoDeHanoi.fazerJogada(2, 1);
        jogoDeHanoi.fazerJogada(2, 3);
        jogoDeHanoi.fazerJogada(1, 2);
        jogoDeHanoi.fazerJogada(1, 3);
        jogoDeHanoi.fazerJogada(2, 3);


        Assert.assertEquals(true, jogoDeHanoi.terminou());

    }
     @Test
    public void testNumeroDeJogadas() throws Exception {
        jogoDeHanoi.fazerJogada(1, 2);
        jogoDeHanoi.fazerJogada(1, 3);
        jogoDeHanoi.fazerJogada(2, 3);

        Assert.assertEquals(3, jogoDeHanoi.getNumeroJogadas());
    }
    
    @Test
    public void testImprimir(){
        String resultado = jogoDeHanoi.imprimir();
        Assert.assertEquals(resultado, "• Pilha Inicial: 4;3;2;1;\n• Pilha Um: null;null;null;null;\n• Pilha Dois: null;null;null;null;");
    }
    
    @Test
    public void testOrigemVazio(){
        Assert.assertFalse(jogoDeHanoi.getOrigem(1).isEmpty());
    }
    
    @Test
    public void testDestinoVazio(){
    Assert.assertTrue(jogoDeHanoi.getDestino(2).isEmpty());

    }
    @Test
    public void testDestinoIgualOrigem() throws Exception{
        Assert.assertFalse(jogoDeHanoi.fazerJogada(1, 1));
    }
}
