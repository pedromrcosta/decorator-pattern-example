package org.academiadecodigo.Argicultores.ThingsToEatAndCenas;

import org.academiadecodigo.Argicultores.Jolas.Jola;

public class RiceDeTrombas extends AcompaniesDecorator{
























    Jola jola;

    public RiceDeTrombas(Jola jola) {
        this.jola = jola;
    }

    @Override
    public double cost() {
        return jola.cost() + 999.999;
    }

    @Override
    public String getDescription() {
        return jola.getDescription() + " our favourite rice de trombas";
    }
}
