/*

APS - ESTRUTURA DE DADOS
ALUNOS: 
Lucas Rodrigues Souza - RA: 21069949
Danilo Ferrari - RA: 21086355
Manoel Merlin - RA: 21154363
Lucas Oliveira - RA: 21094755

 */
package jogo;

import pilha.estatica.classes.PilhaEstatica;
import pilha.estatica.exceptions.PilhaEstaticaException;
import pilha.estatica.interfaces.IPilhaEstatica;

public class JogoDeHanoi {

    private final IPilhaEstatica PilhaInicial, PilhaUm, PilhaDois;
    private final int TamanhoDasPilhas;
    private int NumeroDeJogadas;
    private IPilhaEstatica origem = null;
    private IPilhaEstatica destino = null;

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

        if (numeroDaTorreDeOrigem == 0 || numeroDaTorreDeDestino == 0) {
            return false;
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

        if (!(destino.isEmpty())) {
            if (topoDaOrigem > topoDoDestino) {
                return false;
            }
        }
        destino.push(origem.pop());
        if (destino != origem) {
            this.NumeroDeJogadas++;
        }

        return true;
    }

    public boolean terminou() {
        if (this.PilhaInicial.isEmpty() && (this.PilhaUm.isFull() || this.PilhaDois.isFull())) {
            this.NumeroDeJogadas = 0;
            return true;
        }
        return false;
    }

    public String imprimir() {
        return "• Pilha Inicial: " + PilhaInicial.exibirPilha()
                + "\n• Pilha Um: " + PilhaUm.exibirPilha()
                + "\n• Pilha Dois: " + PilhaDois.exibirPilha();
    }

    public int getNumeroJogadas() {
        return NumeroDeJogadas;
    }

    public IPilhaEstatica getPilhaInicial() {
        return PilhaInicial;
    }

    public IPilhaEstatica getPilhaUm() {
        return PilhaUm;
    }

    public IPilhaEstatica getPilhaDois() {
        return PilhaDois;
    }

    public IPilhaEstatica getOrigem(int numeroTorreOrigem) {
        switch (numeroTorreOrigem) {
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

        return origem;
    }

    public IPilhaEstatica getDestino(int numeroTorreDestino) {
        switch (numeroTorreDestino) {
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
        return destino;
    }
}
