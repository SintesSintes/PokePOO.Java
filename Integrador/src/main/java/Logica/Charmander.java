
package Logica;

public class Charmander extends Pokemon implements iFuego {

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
                System.out.println("Soy Charmander y este es mi ataque placaje");

    }

    @Override
    protected void atacarAraniazo() {
                System.out.println("Soy Charmander y este es mi ataque araniazo");

    }

    @Override
    protected void atacarMordisco() {
                System.out.println("Soy Charmander y este es mi ataque Mordisco");

    }

    @Override
    public void atacarAscuas() {
                System.out.println("Soy Charmander y este es mi ataque Ascuas");

    }

    @Override
    public void atacarPunioFuego() {
                System.out.println("Soy Charmander y este es mi ataque Puño fuego");

    }
    
}
