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
        System.out.println(jogoDeHanoi.imprimir());
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

        System.out.println(jogoDeHanoi.imprimir());

        Assert.assertEquals(true, jogoDeHanoi.terminou());

    }

    @Test
    public void testNumeroDeJogadas() throws Exception {
        jogoDeHanoi.fazerJogada(1, 2);
        jogoDeHanoi.fazerJogada(1, 3);
        jogoDeHanoi.fazerJogada(2, 3);

        Assert.assertEquals(3, jogoDeHanoi.getNumeroJogadas());
    }

}
