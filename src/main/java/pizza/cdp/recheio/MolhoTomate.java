/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.cdp.recheio;

import pizza.cdp.Recheio;
import pizza.util.Fabrica.FabricaPizza;

/**
 *
 * @author IzabelyFurtado
 */
public class MolhoTomate extends Recheio {

    public MolhoTomate(FabricaPizza pizza) {
        super("Molho de Tomate", pizza, 3F);
    }
    

}
