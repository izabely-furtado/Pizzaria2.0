/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.cdp.decorator.massa;

import pizza.cdp.decorator.Massa;
import pizza.util.Fabrica.FabricaPizza;

/**
 *
 * @author IzabelyFurtado
 */
public class Cone extends Massa {

    public Cone(FabricaPizza pizza) {
        super("Massa Cone", pizza, 10F);
    }
    
}
