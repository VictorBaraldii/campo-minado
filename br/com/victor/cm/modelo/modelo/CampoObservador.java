package br.com.victor.cm.modelo.modelo;

@FunctionalInterface
public interface CampoObservador {

    public void eventoOcorre(Campo campo, CampoEvento evento);
}
