package org.academiadecodigo.Argicultores.ThingsToEatAndCenas;

import org.academiadecodigo.Argicultores.Jolas.Jola;

public class Chip extends AcompaniesDecorator {

    private Jola jola;

    public Chip(Jola jola) {
        this.jola = jola;
    }

    @Override
    public double cost() {
        return jola.cost() + 9.99;
    }

    @Override
    public String getDescription() {
        return jola.getDescription() + " chips";
    }
}