package org.academiadecodigo.Argicultores;

import org.academiadecodigo.Argicultores.Jolas.*;
import org.academiadecodigo.Argicultores.ThingsToEatAndCenas.*;

public class JolaStore {

    public static void main(String[] args) {
        System.out.println("--- JOLA68STORE ---");
        System.out.println("FRIDAY 18PM, CADETS ARE THIRSTY SEND BEER");

        Jola jola = new CadetJola();
        System.out.println(jola.getDescription() + ": " + jola.cost() + "$");

        System.out.println("\nOH NO RAQUEL IS COMING, BUT SHE WANTS ACOMPANHEITES");
        Jola mcJola = new McJola();
        mcJola = new Tremocato(mcJola);
        System.out.println(mcJola.getDescription() + ": " + mcJola.cost() + "$");

        System.out.println("\nHELL YEAH, JONNY SINS CAME TO THE CODE BRAKE! \nBUT HIS HUNGRY AF");
        Jola sinJola = new MooJola();
        sinJola = new Chip(sinJola);
        sinJola = new Peanut(sinJola);
        sinJola = new RiceDeTrombas(sinJola);
        System.out.println(sinJola.getDescription() + ": " + sinJola.cost() + "$");

        System.out.println("\nSUPERBOCK WANTS TO JOIN IN WOOHOOOOO !");
        Jola superbock = new Superbock();
        superbock = new Tremocato(superbock);
        System.out.println(superbock.getDescription() + ": " + superbock.cost() + "$");

    }

}
