/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.cdp.decorator.recheio;

import pizza.util.Fabrica.FabricaPizza;

/**
 *
 * @author IzabelyFurtado
 */
public class Mussarela extends Queijo {

    public Mussarela(FabricaPizza pizza) {
        super("Queijo Mussarela", pizza);
    }
   
    
}
