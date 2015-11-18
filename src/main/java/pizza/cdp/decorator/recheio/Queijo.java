/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.cdp.decorator.recheio;

import pizza.cdp.decorator.Recheio;
import pizza.util.Fabrica.FabricaPizza;

/**
 *
 * @author IzabelyFurtado
 */
public abstract class Queijo extends Recheio {

    public Queijo(String nome, FabricaPizza pizza) {
        super(nome, pizza, 1F);
    }
    
}
