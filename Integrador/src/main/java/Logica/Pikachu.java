
package Logica;

public class Pikachu extends Pokemon implements iElectrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
                System.out.println("Soy Pikachu y este es mi ataque placaje");

    }

    @Override
    protected void atacarAraniazo() {
                System.out.println("Soy Pikachu y este es mi ataque araniazo");

    }

    @Override
    protected void atacarMordisco() {
                System.out.println("Soy Pikachu y este es mi ataque mordisco");

    }

    @Override
    public void atacarImpactrueno() {
                System.out.println("Soy Pikachu y este es mi ataque Impactrueno");

    }

    @Override
    public void atacarPuiooTrueno() {
                System.out.println("Soy Pikachu y este es mi ataque puño trueno");

    }
    
}
