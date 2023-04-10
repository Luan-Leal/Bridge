package org.example;

public abstract class Temporada {

    protected FaixaEtaria faixaEtaria;

    protected float Demanda;

    public Temporada(float Demanda) {
        this.Demanda = Demanda;
    }

    public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public void setDemanda(float Demanda) {
        this.Demanda = Demanda;
    }

    public abstract float AdicionarPeca();
}
