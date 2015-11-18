/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.cdp.decorator;

import pizza.util.Fabrica.FabricaPizza;

/**
 *
 * @author IzabelyFurtado
 */
public abstract class Recheio extends Ingrediente {

    public Recheio(String nome, FabricaPizza pizza, float preco) {
        super(nome, pizza, preco);
    }
    
}
