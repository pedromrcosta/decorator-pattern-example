package org.academiadecodigo.Argicultores.ThingsToEatAndCenas;

import org.academiadecodigo.Argicultores.Jolas.Jola;

public class Tremocato extends AcompaniesDecorator{
    private Jola jola;

    public Tremocato(Jola jola) {
        this.jola = jola;
    }

    @Override
    public double cost() {
        return jola.cost() + 6.66;
    }

    @Override
    public String getDescription() {
        return jola.getDescription() + " TREMOCEITO";
    }
}