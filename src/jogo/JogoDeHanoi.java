package jogo;

import pilha.estatica.classes.PilhaEstatica;
import pilha.estatica.exceptions.PilhaEstaticaException;
import pilha.estatica.interfaces.IPilhaEstatica;

public class JogoDeHanoi {

    private final IPilhaEstatica PilhaInicial, PilhaUm, PilhaDois;
    private final int TamanhoDasPilhas;
    private int NumeroDeJogadas;

    public JogoDeHanoi(int tamanhoDasPilhas) throws Exception {
        this.TamanhoDasPilhas = tamanhoDasPilhas;

        this.PilhaInicial = new PilhaEstatica(tamanhoDasPilhas);
        this.PilhaUm = new PilhaEstatica(tamanhoDasPilhas);
        this.PilhaDois = new PilhaEstatica(tamanhoDasPilhas);

        for (int i = tamanhoDasPilhas; i > 0; i--) {
            this.PilhaInicial.push((int) i);
        }

        this.NumeroDeJogadas = 0;
    }

    public boolean fazerJogada(int numeroDaTorreDeOrigem, int numeroDaTorreDeDestino) throws Exception {

        IPilhaEstatica origem = null;
        IPilhaEstatica destino = null;

        if (numeroDaTorreDeOrigem == 0 || numeroDaTorreDeDestino == 0) {
            throw new Exception("O número de identificação das torres não pode ser zero");
        }

        switch (numeroDaTorreDeOrigem) {
            case 1:
                origem = PilhaInicial;
                break;
            case 2:
                origem = PilhaUm;
                break;
            case 3:
                origem = PilhaDois;
                break;
        }

        if (origem.isEmpty()) {
            return false;
        }

        switch (numeroDaTorreDeDestino) {
            case 1:
                destino = PilhaInicial;
                break;
            case 2:
                destino = PilhaUm;
                break;
            case 3:
                destino = PilhaDois;
                break;
        }

        if (destino.isFull()) {
            return false;
        }

        int topoDaOrigem = (int) origem.peek();
        int topoDoDestino = 0;

        try {
            topoDoDestino = (int) destino.peek();

        } catch (PilhaEstaticaException ex) {
            topoDoDestino = 0;
        }

        if (topoDaOrigem < topoDoDestino) {
            return false;
        }

        destino.push(origem.pop());

        this.NumeroDeJogadas++;

        return true;
    }

    public boolean terminou() {
        return (this.PilhaInicial.isEmpty() & this.PilhaUm.isEmpty()) || (this.PilhaInicial.isEmpty() & this.PilhaDois.isEmpty());
    }

    public String imprimir() {
        return "• Pilha Inicial: " + PilhaInicial.exibirPilha()
                + "\n• Pilha Um: " + PilhaUm.exibirPilha()
                + "\n• Pilha Dois: " + PilhaDois.exibirPilha();
    }

    public int getNumeroJogadas() {
        return NumeroDeJogadas;
    }
}
