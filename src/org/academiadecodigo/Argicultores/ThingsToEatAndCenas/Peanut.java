package org.academiadecodigo.Argicultores.ThingsToEatAndCenas;

import org.academiadecodigo.Argicultores.Jolas.Jola;

public class Peanut extends AcompaniesDecorator{

    private Jola jola;

    public Peanut(Jola jola) {
        this.jola = jola;
    }

    @Override
    public double cost() {
        return jola.cost() + 3.33;
    }

    @Override
    public String getDescription() {
        return jola.getDescription() + " salty pinut";
    }
}