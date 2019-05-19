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
    
    
}
