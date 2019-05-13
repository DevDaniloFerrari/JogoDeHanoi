package jogo;

import pilha.estatica.classes.PilhaEstatica;
import pilha.estatica.interfaces.IPilhaEstatica;

public class JogoDeHanoi {

    private final IPilhaEstatica PilhaInicial, PilhaUm, PilhaDois;
    private int NumeroDeJogadas;
    private int TamanhoDasPilhas;

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

    public boolean fazerJogada(int numeroNaTorreDeOrigem, int numeroNaTorreDeDestino) throws Exception {
        IPilhaEstatica pilhaDeOrigem = this.obterTorre(numeroNaTorreDeOrigem);
        IPilhaEstatica pilhaDeDestino = this.obterTorre(numeroNaTorreDeDestino);
        
        if(pilhaDeOrigem==null || pilhaDeDestino==null){
            return false;
        }
        
        if(pilhaDeOrigem.isEmpty()){
            return false;
        }
        
        if(pilhaDeDestino.isFull()){
            return false;
        }
        
        if((int)pilhaDeOrigem.peek()>(int)pilhaDeDestino.peek()){
            return false;
        }
        
        pilhaDeDestino.push(pilhaDeOrigem.pop());
        this.NumeroDeJogadas++;
        
        return true;
    }
    
    // Implementação método terminou...
    public boolean terminou(){
      return (this.PilhaInicial.isEmpty() & this.PilhaUm.isEmpty()) || ( this.PilhaInicial.isEmpty() & this.PilhaDois.isEmpty());
    }

    private IPilhaEstatica obterTorre(int topo) throws Exception {

        if (topo < 0 || topo > this.TamanhoDasPilhas) {
            return null;
        }
        
        if(!this.PilhaInicial.isEmpty()){
            if(topo == (int)this.PilhaInicial.peek())
                return this.PilhaInicial;
        }
        
        if(!this.PilhaUm.isEmpty()){
            if(topo == (int)this.PilhaUm.peek())
                return this.PilhaUm;
        }
        
        if(!this.PilhaDois.isEmpty()){
            if(topo == (int)this.PilhaDois.peek())
                return this.PilhaDois;
        }
        
        return null;
    }
}
