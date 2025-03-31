/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

public class Bulbausaur extends Pokemon implements iPlanta {

    public Bulbausaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Balbausaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
                System.out.println("Soy Balbausaur y este es mi ataque araniazo");

    }

    @Override
    protected void atacarMordisco() {
                System.out.println("Soy Balbausaur y este es mi ataque mordisco");

    }

    @Override
    public void atacarLatigoSepa() {
              System.out.println("Soy Balbausaur y este es mi ataque Latigo Sepa");

    }

    @Override
    public void atacarDrenadoras() {
              System.out.println("Soy Balbausaur y este es mi ataque Drenadoras");

    }
    
}
