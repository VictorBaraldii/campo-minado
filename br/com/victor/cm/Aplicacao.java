package br.com.victor.cm;

import br.com.victor.cm.modelo.Tabuleiro;
import br.com.victor.cm.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
        new TabuleiroConsole((tabuleiro));

    }
}
