package jogo;

import pilha.estatica.classes.PilhaEstatica;
import pilha.estatica.interfaces.IPilhaEstatica;

public class JogoDeHanoi {

    private final IPilhaEstatica PilhaInicial, PilhaUm, PilhaDois;
    private final int TamanhoDasPilhas;
    private int NumeroDeJogadas;

    public JogoDeHanoi(int tamanhoDasPilhas) throws Exception {
        this.TamanhoDasPilhas = tamanhoDasPilhas;
        this.PilhaInicial = new PilhaEstatica(tamanhoDasPilhas);

        for (int i = tamanhoDasPilhas; i > 0; i--) {
            this.PilhaInicial.push(i);
        }

        this.PilhaUm = new PilhaEstatica(tamanhoDasPilhas);
        this.PilhaDois = new PilhaEstatica(tamanhoDasPilhas);

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
            case 2:
                origem = PilhaUm;
            case 3:
                origem = PilhaDois;
        }

        if (origem.isEmpty()) {
            return false;
        }

        switch (numeroDaTorreDeDestino) {
            case 1:
                destino = PilhaInicial;
            case 2:
                destino = PilhaUm;
            case 3:
                destino = PilhaDois;
        }

        if (destino.isFull()) {
            return false;
        }

        if (((int) origem.peek()) > ((int) destino.peek())) {
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
