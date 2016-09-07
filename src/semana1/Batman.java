/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

/**
 *
 * @author laboratorio
 */
public class Batman extends Superheroe {

    private Persona persona;
    
    public Batman() {
        persona = new Persona(nombre, "Wayne");
    }

    @Override
    public void combatirCrimen() {
        System.out.println("Combatiendo el crimen con dinero");
    }
    
}
