package org.example;

public class TempVerao extends Temporada {

    public TempVerao(float NumeroPeca) {
        super(NumeroPeca);
    }

    public float AdicionarPeca() {
        return this.Demanda * (1 + this.faixaEtaria.NumeroPecas());
    }

}
