package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class TempInvernoTest {

    @Test
    void deveRetornarNumeroPecasParaCriancas() {
        FaixaEtaria faixaEtaria = new Criança();
        TempInverno tempInverno = new TempInverno(10.0f);
        tempInverno.setFaixaEtaria(faixaEtaria);
        assertEquals(10.0f, tempInverno.AdicionarPeca(), 0.01f);
    }

    @Test
    void deveRetornarNumeroPecasParaAdolescente() {
        FaixaEtaria faixaEtaria = new Adolescente();
        TempInverno tempInverno = new TempInverno(10.0f);
        tempInverno.setFaixaEtaria(faixaEtaria);
        assertEquals(10.0f, tempInverno.AdicionarPeca(), 0.01f);
    }

    @Test
    void deveRetornarNumeroPecasParaAdulto() {
        FaixaEtaria faixaEtaria = new Adulto();
        TempInverno tempInverno = new TempInverno(10.0f);
        tempInverno.setFaixaEtaria(faixaEtaria);
        assertEquals(10.0f, tempInverno.AdicionarPeca(), 0.01f);
    }

    @Test
    void deveRetornarNumeroPecasParaIdoso() {
        FaixaEtaria faixaEtaria = new Idoso();
        TempInverno tempInverno = new TempInverno(10.0f);
        tempInverno.setFaixaEtaria(faixaEtaria);
        assertEquals(10.0f, tempInverno.AdicionarPeca(), 0.01f);
    }

}