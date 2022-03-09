package org.academiadecodigo.Argicultores.Jolas;

public abstract class Jola {

    private String description = "THIS IS AN ABSTRACT CLASS FFS";

    public Jola() {
        // just do the penguin dance, everybody is happy :)
        description = "<(''<) (>''<) (>'')>";
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
