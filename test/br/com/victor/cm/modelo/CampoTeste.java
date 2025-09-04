package br.com.victor.cm.modelo;

import br.com.victor.cm.excecao.ExplosaoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampoTeste {

    private Campo campo;

    @BeforeEach
    void iniciarCampo() {
        campo = new Campo(3, 3);
    }

    @Test
    void testeVizinhoDistancia1Esquerda() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Direita() {
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1EmCima() {
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1EmBaixo() {
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia2() {
        Campo vizinho = new Campo(2, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeNaoVizinho() {
        Campo vizinho = new Campo(1, 1);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertFalse(resultado);
    }

    @Test
    void testeValorPadraoAtributoMarcadado() {
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacao() {
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacaoDuasChamadas() {
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAbrirNaoMinadoNaoMarcado() {
        assertTrue(campo.abrir());
    }

    @Test
    void testeAbrirNaoMinadoMarcado() {
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoMarcado() {
        campo.alternarMarcacao();
        campo.minar();
        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoNaoMarcado() {
        campo.minar();

        assertThrows(ExplosaoException.class, () -> {
            campo.abrir();
        });
    }

    @Test
    void testeAbrirComVizinhos1() {

        Campo campo11 = new Campo(1, 1);

        Campo campo22 = new Campo(2, 2);
        campo22.adicionarVizinho(campo11);

        campo.adicionarVizinho(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isAberto());
    }

    @Test
    void testeAbrirComVizinhos2() {

        Campo campo11 = new Campo(1, 1);
        Campo campo12 = new Campo(1, 2);
        campo12.minar();

        Campo campo22 = new Campo(2, 2);
        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);

        campo.adicionarVizinho(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isFechado());
    }

    @Test
    void testeCampoMarcado() {
        Campo campo = new Campo(1, 1);
        campo.alternarMarcacao();
        assertEquals("X", campo.toString());
    }

    @Test
    void testeCampoAbertoMinado() {
        Campo campo = new Campo(1, 1);
        campo.minar();
        assertThrows(ExplosaoException.class, campo::abrir);
        assertEquals("*", campo.toString());
    }

    @Test
    void testeCampoAbertoMinasNaVinhanca() {
        Campo campo = new Campo(1, 1);
        Campo vizinho = new Campo(1, 2);
        vizinho.minar();
        campo.adicionarVizinho(vizinho);

        campo.abrir();
        assertEquals("1", campo.toString());
    }

    @Test
    void testeCampoFechadoNaoMarcado() {
        Campo campo = new Campo(1,1);
        assertEquals("?", campo.toString());
    }

    @Test
    void testeObjetivoAlcancadoQuandoDesvendado() {
        Campo campo = new Campo(1,1);
        campo.abrir();
        assertTrue(campo.objetivoAlcancado());

    }

    @Test
    void testeObjetivoAlcancadoQuandoProtegido() {
        Campo campo = new Campo(1, 1);
        campo.minar();
        campo.alternarMarcacao();
        assertTrue(campo.objetivoAlcancado());
    }

    @Test
    void testeObjetivoNaoAlcancadoQuandoFechadoSemMina() {
        Campo campo = new Campo(1, 1);
        assertFalse(campo.objetivoAlcancado());
    }

    @Test
    void testeObjetivoNaoAlcancadoQuandoMinadoENaoMarcado() {
        Campo campo = new Campo(1, 1);
        campo.minar();
        assertFalse(campo.objetivoAlcancado());
    }

    @Test
    void testeReiniciarResetaEstado() {
        Campo campo = new Campo(1, 1);
        campo.minar();
        campo.alternarMarcacao();
        campo.abrir();

        campo.reiniciar();

        assertFalse(campo.isMarcado());
        assertFalse(campo.objetivoAlcancado());
        assertTrue(campo.abrir());

    }

}

