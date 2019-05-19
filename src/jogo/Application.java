package jogo;

import java.util.Scanner;
import pilha.estatica.classes.PilhaEstatica;

public class Application {
    
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
        JogoDeHanoi jogoDeHanoi = new JogoDeHanoi(4);
        System.out.println(jogoDeHanoi.imprimir());
        
        System.out.println("Digite a pilha de destino"+
                "\n1 - Pilha Um"+
                "\n2 - Pilha dois");
        do{
        int resposta = entrada.nextInt();
        switch(resposta){
            case 1:
                jogoDeHanoi.fazerJogada(1,1);
                break;
            case 2:
                jogoDeHanoi.fazerJogada(1, 2);
                break;
        }
        
        System.out.println(jogoDeHanoi.imprimir());
        
        }while(true); //do while só pra testar  precisa arrumar.
        
    }
}
