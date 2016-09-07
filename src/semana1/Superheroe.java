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
public abstract class Superheroe implements 
        AccionesPersonales{
    
    protected String traje;
    protected String nombre;
    protected String causa;
    protected boolean tieneNovia;

    @Override
    public boolean comer(String comida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dormir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
