package org.academiadecodigo.Argicultores;

import org.academiadecodigo.Argicultores.Jolas.CadetJola;
import org.academiadecodigo.Argicultores.Jolas.Jola;
import org.academiadecodigo.Argicultores.Jolas.McJola;
import org.academiadecodigo.Argicultores.Jolas.MooJola;
import org.academiadecodigo.Argicultores.ThingsToEatAndCenas.Chip;
import org.academiadecodigo.Argicultores.ThingsToEatAndCenas.Peanut;
import org.academiadecodigo.Argicultores.ThingsToEatAndCenas.RiceDeTrombas;
import org.academiadecodigo.Argicultores.ThingsToEatAndCenas.Tremocato;

public class JolaStore {

    public static void main(String[] args) {
        System.out.println("--- JOLA68STORE ---");
        System.out.println("FRIDAY 18PM, CADETS ARE THIRSTY SEND BEER");

        Jola jola = new CadetJola();
        System.out.println(jola.getDescription() + ": " + jola.cost() + "$");

        System.out.println("OH NO RAQUEL IS COMING, BUT SHE WANTS ACOMPANHEITES");
        Jola mcJola = new McJola();
        mcJola = new Tremocato(mcJola);
        System.out.println(mcJola.getDescription() + ": " + mcJola.cost() + "$");

        System.out.println("HELL YEAH, JONNY SINS CAME TO THE CODE BRAKE! \nBUT HIS HUNGRY AF");
        Jola sinJola = new MooJola();
        sinJola = new Chip(sinJola);
        sinJola = new Peanut(sinJola);
        sinJola = new RiceDeTrombas(sinJola);
        System.out.println(sinJola.getDescription() + ": " + sinJola.cost() + "$");

    }

}
