package jogo;

import classe.acessoria.Acessorio;
import java.util.Random;



public class Jogo {
    
    private String opcaoDeJogada;
    private short numeroDigitado;

    public String getOpcaoDeJogada() {
        return opcaoDeJogada;
    }

    public void setOpcaoDeJogada(String opcaoDeJogada) {
        this.opcaoDeJogada = opcaoDeJogada;
    }

    public short getNumeroDigitado() {
        return numeroDigitado;
    }

    public void setNumeroDigitado(short numeroDigitado) {
        this.numeroDigitado = numeroDigitado;
    }
    
    public String jogada(){
        
        Random random = new Random();
        
        int numAleatorio = random.nextInt(100);
        String msg = "";
        
        try{
            
            if(this.getOpcaoDeJogada().equals("Par")){
                if(Acessorio.soma(this.getNumeroDigitado(), numAleatorio) % 2 == 0){
                    msg += "<h3>PARABÉNS!!! :) ...<br>Você ganhou!</h3>";
                    msg += "<p>O resultado deu " + Acessorio.soma(this.getNumeroDigitado(), numAleatorio) + "</p>";
                }
                else{
                    if(Acessorio.soma(this.getNumeroDigitado(), numAleatorio) % 2 != 0){
                        msg += "<h3>NÃO FOI DESSA VEZ! :( ...<br>Você perdeu!</h3>";
                        msg += "<p>O resultado deu " + Acessorio.soma(this.getNumeroDigitado(), numAleatorio) + "</p>";
                    }
                }
            }
            else{
                if(this.getOpcaoDeJogada().equals("Impar")){
                    if(Acessorio.soma(this.getNumeroDigitado(), numAleatorio) % 2 == 0){
                        msg += "<h3>NÃO FOI DESSA VEZ! :( ...<br>Você perdeu!</h3>";
                        msg += "<p>O resultado deu " + Acessorio.soma(this.getNumeroDigitado(), numAleatorio) + "</p>";
                    }
                    else{
                        if(Acessorio.soma(this.getNumeroDigitado(), numAleatorio) % 2 != 0){
                            msg += "<h3>PARABÉNS!!! :) ...<br>Você ganhou!</h3>";
                            msg += "<p>O resultado deu " + Acessorio.soma(this.getNumeroDigitado(), numAleatorio) + "</p>";
                        }
                    }
                }
            }
        }
        catch(Exception e){
            msg += "<h3>Error :/ ... " + e.getMessage() + "</h3>";
        }
        
        return msg;
    }
}
