package br.com.victor.cm;

import br.com.victor.cm.modelo.Tabuleiro;

public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuileiro = new Tabuleiro(6,6,6);

        tabuileiro.abrir(3, 3);
        tabuileiro.alternarMarcacao(4,4);
        tabuileiro.alternarMarcacao(4,5);


        System.out.println(tabuileiro);
    }
}
